package com.unknow.service.impl;

import com.unknow.dto.BaseMenu;
import com.unknow.mapper.AreaMapper;
import com.unknow.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by hotman on 2017/4/16.
 */
@Service
public class AreaServiceImpl implements AreaService {

    @Autowired
    private AreaMapper areaMapper;

    @Override
    public List<BaseMenu> findTreeByEmplayeeId(String id) {

        List<BaseMenu> areas = areaMapper.findTree().stream().map(e -> {
            BaseMenu menu = new BaseMenu();
            menu.setId(e.getAreaZhcode());
            menu.setText(e.getAreaName());
            return menu;
        }).collect(Collectors.toList());

        List<BaseMenu> ss = areas.stream().filter(e -> e.getId().trim().length() == 2).collect(Collectors.toList());

        for (BaseMenu s : ss) {
            List<BaseMenu> tt = areas.stream().filter(e -> e.getId().trim().length() == 4 && e.getId().trim().startsWith(s.getId())).collect(Collectors.toList());
            for (BaseMenu ts : tt) {
                List<BaseMenu> tts = areas.stream().filter(e -> e.getId().trim().length() == 7 && e.getId().trim().startsWith(ts.getId()))
                        .map(e -> {
                            BaseMenu m = e;
                            e.setState("open");
                            return m;
                        })
                        .collect(Collectors.toList());

                ts.setChildren(tts);
            }
            s.setChildren(tt);
        }
        return ss;
    }


//    private List<BaseMenu> getChildren(List<BaseMenu> result, String rootId) {
//        List<BaseMenu> r = new ArrayList<>();
//        for (int i = 0; i < result.size(); i++) {
//            BaseMenu t = result.get(i);
//            if (!rootId.equals(t.getId()) && t.getId().startsWith(rootId)) {
//                List<BaseMenu> children = getChildren(result, t.getId());
//
//                if (!children.isEmpty()) {
//                    t.setChildren(children);
//                }
//                r.add(t);
//            }
//        }
//        return r;
//    }

}
