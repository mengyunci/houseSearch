package com.unknow.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HouseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HouseExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andAreaSerialIsNull() {
            addCriterion("area_serial is null");
            return (Criteria) this;
        }

        public Criteria andAreaSerialIsNotNull() {
            addCriterion("area_serial is not null");
            return (Criteria) this;
        }

        public Criteria andAreaSerialEqualTo(String value) {
            addCriterion("area_serial =", value, "areaSerial");
            return (Criteria) this;
        }

        public Criteria andAreaSerialNotEqualTo(String value) {
            addCriterion("area_serial <>", value, "areaSerial");
            return (Criteria) this;
        }

        public Criteria andAreaSerialGreaterThan(String value) {
            addCriterion("area_serial >", value, "areaSerial");
            return (Criteria) this;
        }

        public Criteria andAreaSerialGreaterThanOrEqualTo(String value) {
            addCriterion("area_serial >=", value, "areaSerial");
            return (Criteria) this;
        }

        public Criteria andAreaSerialLessThan(String value) {
            addCriterion("area_serial <", value, "areaSerial");
            return (Criteria) this;
        }

        public Criteria andAreaSerialLessThanOrEqualTo(String value) {
            addCriterion("area_serial <=", value, "areaSerial");
            return (Criteria) this;
        }

        public Criteria andAreaSerialLike(String value) {
            addCriterion("area_serial like", value, "areaSerial");
            return (Criteria) this;
        }

        public Criteria andAreaSerialNotLike(String value) {
            addCriterion("area_serial not like", value, "areaSerial");
            return (Criteria) this;
        }

        public Criteria andAreaSerialIn(List<String> values) {
            addCriterion("area_serial in", values, "areaSerial");
            return (Criteria) this;
        }

        public Criteria andAreaSerialNotIn(List<String> values) {
            addCriterion("area_serial not in", values, "areaSerial");
            return (Criteria) this;
        }

        public Criteria andAreaSerialBetween(String value1, String value2) {
            addCriterion("area_serial between", value1, value2, "areaSerial");
            return (Criteria) this;
        }

        public Criteria andAreaSerialNotBetween(String value1, String value2) {
            addCriterion("area_serial not between", value1, value2, "areaSerial");
            return (Criteria) this;
        }

        public Criteria andHouseSerialIsNull() {
            addCriterion("house_serial is null");
            return (Criteria) this;
        }

        public Criteria andHouseSerialIsNotNull() {
            addCriterion("house_serial is not null");
            return (Criteria) this;
        }

        public Criteria andHouseSerialEqualTo(String value) {
            addCriterion("house_serial =", value, "houseSerial");
            return (Criteria) this;
        }

        public Criteria andHouseSerialNotEqualTo(String value) {
            addCriterion("house_serial <>", value, "houseSerial");
            return (Criteria) this;
        }

        public Criteria andHouseSerialGreaterThan(String value) {
            addCriterion("house_serial >", value, "houseSerial");
            return (Criteria) this;
        }

        public Criteria andHouseSerialGreaterThanOrEqualTo(String value) {
            addCriterion("house_serial >=", value, "houseSerial");
            return (Criteria) this;
        }

        public Criteria andHouseSerialLessThan(String value) {
            addCriterion("house_serial <", value, "houseSerial");
            return (Criteria) this;
        }

        public Criteria andHouseSerialLessThanOrEqualTo(String value) {
            addCriterion("house_serial <=", value, "houseSerial");
            return (Criteria) this;
        }

        public Criteria andHouseSerialLike(String value) {
            addCriterion("house_serial like", value, "houseSerial");
            return (Criteria) this;
        }

        public Criteria andHouseSerialNotLike(String value) {
            addCriterion("house_serial not like", value, "houseSerial");
            return (Criteria) this;
        }

        public Criteria andHouseSerialIn(List<String> values) {
            addCriterion("house_serial in", values, "houseSerial");
            return (Criteria) this;
        }

        public Criteria andHouseSerialNotIn(List<String> values) {
            addCriterion("house_serial not in", values, "houseSerial");
            return (Criteria) this;
        }

        public Criteria andHouseSerialBetween(String value1, String value2) {
            addCriterion("house_serial between", value1, value2, "houseSerial");
            return (Criteria) this;
        }

        public Criteria andHouseSerialNotBetween(String value1, String value2) {
            addCriterion("house_serial not between", value1, value2, "houseSerial");
            return (Criteria) this;
        }

        public Criteria andBuildingSerialIsNull() {
            addCriterion("building_serial is null");
            return (Criteria) this;
        }

        public Criteria andBuildingSerialIsNotNull() {
            addCriterion("building_serial is not null");
            return (Criteria) this;
        }

        public Criteria andBuildingSerialEqualTo(String value) {
            addCriterion("building_serial =", value, "buildingSerial");
            return (Criteria) this;
        }

        public Criteria andBuildingSerialNotEqualTo(String value) {
            addCriterion("building_serial <>", value, "buildingSerial");
            return (Criteria) this;
        }

        public Criteria andBuildingSerialGreaterThan(String value) {
            addCriterion("building_serial >", value, "buildingSerial");
            return (Criteria) this;
        }

        public Criteria andBuildingSerialGreaterThanOrEqualTo(String value) {
            addCriterion("building_serial >=", value, "buildingSerial");
            return (Criteria) this;
        }

        public Criteria andBuildingSerialLessThan(String value) {
            addCriterion("building_serial <", value, "buildingSerial");
            return (Criteria) this;
        }

        public Criteria andBuildingSerialLessThanOrEqualTo(String value) {
            addCriterion("building_serial <=", value, "buildingSerial");
            return (Criteria) this;
        }

        public Criteria andBuildingSerialLike(String value) {
            addCriterion("building_serial like", value, "buildingSerial");
            return (Criteria) this;
        }

        public Criteria andBuildingSerialNotLike(String value) {
            addCriterion("building_serial not like", value, "buildingSerial");
            return (Criteria) this;
        }

        public Criteria andBuildingSerialIn(List<String> values) {
            addCriterion("building_serial in", values, "buildingSerial");
            return (Criteria) this;
        }

        public Criteria andBuildingSerialNotIn(List<String> values) {
            addCriterion("building_serial not in", values, "buildingSerial");
            return (Criteria) this;
        }

        public Criteria andBuildingSerialBetween(String value1, String value2) {
            addCriterion("building_serial between", value1, value2, "buildingSerial");
            return (Criteria) this;
        }

        public Criteria andBuildingSerialNotBetween(String value1, String value2) {
            addCriterion("building_serial not between", value1, value2, "buildingSerial");
            return (Criteria) this;
        }

        public Criteria andHouseNameIsNull() {
            addCriterion("house_name is null");
            return (Criteria) this;
        }

        public Criteria andHouseNameIsNotNull() {
            addCriterion("house_name is not null");
            return (Criteria) this;
        }

        public Criteria andHouseNameEqualTo(String value) {
            addCriterion("house_name =", value, "houseName");
            return (Criteria) this;
        }

        public Criteria andHouseNameNotEqualTo(String value) {
            addCriterion("house_name <>", value, "houseName");
            return (Criteria) this;
        }

        public Criteria andHouseNameGreaterThan(String value) {
            addCriterion("house_name >", value, "houseName");
            return (Criteria) this;
        }

        public Criteria andHouseNameGreaterThanOrEqualTo(String value) {
            addCriterion("house_name >=", value, "houseName");
            return (Criteria) this;
        }

        public Criteria andHouseNameLessThan(String value) {
            addCriterion("house_name <", value, "houseName");
            return (Criteria) this;
        }

        public Criteria andHouseNameLessThanOrEqualTo(String value) {
            addCriterion("house_name <=", value, "houseName");
            return (Criteria) this;
        }

        public Criteria andHouseNameLike(String value) {
            addCriterion("house_name like", value, "houseName");
            return (Criteria) this;
        }

        public Criteria andHouseNameNotLike(String value) {
            addCriterion("house_name not like", value, "houseName");
            return (Criteria) this;
        }

        public Criteria andHouseNameIn(List<String> values) {
            addCriterion("house_name in", values, "houseName");
            return (Criteria) this;
        }

        public Criteria andHouseNameNotIn(List<String> values) {
            addCriterion("house_name not in", values, "houseName");
            return (Criteria) this;
        }

        public Criteria andHouseNameBetween(String value1, String value2) {
            addCriterion("house_name between", value1, value2, "houseName");
            return (Criteria) this;
        }

        public Criteria andHouseNameNotBetween(String value1, String value2) {
            addCriterion("house_name not between", value1, value2, "houseName");
            return (Criteria) this;
        }

        public Criteria andHouseInIsNull() {
            addCriterion("house_in is null");
            return (Criteria) this;
        }

        public Criteria andHouseInIsNotNull() {
            addCriterion("house_in is not null");
            return (Criteria) this;
        }

        public Criteria andHouseInEqualTo(String value) {
            addCriterion("house_in =", value, "houseIn");
            return (Criteria) this;
        }

        public Criteria andHouseInNotEqualTo(String value) {
            addCriterion("house_in <>", value, "houseIn");
            return (Criteria) this;
        }

        public Criteria andHouseInGreaterThan(String value) {
            addCriterion("house_in >", value, "houseIn");
            return (Criteria) this;
        }

        public Criteria andHouseInGreaterThanOrEqualTo(String value) {
            addCriterion("house_in >=", value, "houseIn");
            return (Criteria) this;
        }

        public Criteria andHouseInLessThan(String value) {
            addCriterion("house_in <", value, "houseIn");
            return (Criteria) this;
        }

        public Criteria andHouseInLessThanOrEqualTo(String value) {
            addCriterion("house_in <=", value, "houseIn");
            return (Criteria) this;
        }

        public Criteria andHouseInLike(String value) {
            addCriterion("house_in like", value, "houseIn");
            return (Criteria) this;
        }

        public Criteria andHouseInNotLike(String value) {
            addCriterion("house_in not like", value, "houseIn");
            return (Criteria) this;
        }

        public Criteria andHouseInIn(List<String> values) {
            addCriterion("house_in in", values, "houseIn");
            return (Criteria) this;
        }

        public Criteria andHouseInNotIn(List<String> values) {
            addCriterion("house_in not in", values, "houseIn");
            return (Criteria) this;
        }

        public Criteria andHouseInBetween(String value1, String value2) {
            addCriterion("house_in between", value1, value2, "houseIn");
            return (Criteria) this;
        }

        public Criteria andHouseInNotBetween(String value1, String value2) {
            addCriterion("house_in not between", value1, value2, "houseIn");
            return (Criteria) this;
        }

        public Criteria andHouseUnitIsNull() {
            addCriterion("house_unit is null");
            return (Criteria) this;
        }

        public Criteria andHouseUnitIsNotNull() {
            addCriterion("house_unit is not null");
            return (Criteria) this;
        }

        public Criteria andHouseUnitEqualTo(String value) {
            addCriterion("house_unit =", value, "houseUnit");
            return (Criteria) this;
        }

        public Criteria andHouseUnitNotEqualTo(String value) {
            addCriterion("house_unit <>", value, "houseUnit");
            return (Criteria) this;
        }

        public Criteria andHouseUnitGreaterThan(String value) {
            addCriterion("house_unit >", value, "houseUnit");
            return (Criteria) this;
        }

        public Criteria andHouseUnitGreaterThanOrEqualTo(String value) {
            addCriterion("house_unit >=", value, "houseUnit");
            return (Criteria) this;
        }

        public Criteria andHouseUnitLessThan(String value) {
            addCriterion("house_unit <", value, "houseUnit");
            return (Criteria) this;
        }

        public Criteria andHouseUnitLessThanOrEqualTo(String value) {
            addCriterion("house_unit <=", value, "houseUnit");
            return (Criteria) this;
        }

        public Criteria andHouseUnitLike(String value) {
            addCriterion("house_unit like", value, "houseUnit");
            return (Criteria) this;
        }

        public Criteria andHouseUnitNotLike(String value) {
            addCriterion("house_unit not like", value, "houseUnit");
            return (Criteria) this;
        }

        public Criteria andHouseUnitIn(List<String> values) {
            addCriterion("house_unit in", values, "houseUnit");
            return (Criteria) this;
        }

        public Criteria andHouseUnitNotIn(List<String> values) {
            addCriterion("house_unit not in", values, "houseUnit");
            return (Criteria) this;
        }

        public Criteria andHouseUnitBetween(String value1, String value2) {
            addCriterion("house_unit between", value1, value2, "houseUnit");
            return (Criteria) this;
        }

        public Criteria andHouseUnitNotBetween(String value1, String value2) {
            addCriterion("house_unit not between", value1, value2, "houseUnit");
            return (Criteria) this;
        }

        public Criteria andHouseBareaIsNull() {
            addCriterion("house_barea is null");
            return (Criteria) this;
        }

        public Criteria andHouseBareaIsNotNull() {
            addCriterion("house_barea is not null");
            return (Criteria) this;
        }

        public Criteria andHouseBareaEqualTo(BigDecimal value) {
            addCriterion("house_barea =", value, "houseBarea");
            return (Criteria) this;
        }

        public Criteria andHouseBareaNotEqualTo(BigDecimal value) {
            addCriterion("house_barea <>", value, "houseBarea");
            return (Criteria) this;
        }

        public Criteria andHouseBareaGreaterThan(BigDecimal value) {
            addCriterion("house_barea >", value, "houseBarea");
            return (Criteria) this;
        }

        public Criteria andHouseBareaGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("house_barea >=", value, "houseBarea");
            return (Criteria) this;
        }

        public Criteria andHouseBareaLessThan(BigDecimal value) {
            addCriterion("house_barea <", value, "houseBarea");
            return (Criteria) this;
        }

        public Criteria andHouseBareaLessThanOrEqualTo(BigDecimal value) {
            addCriterion("house_barea <=", value, "houseBarea");
            return (Criteria) this;
        }

        public Criteria andHouseBareaIn(List<BigDecimal> values) {
            addCriterion("house_barea in", values, "houseBarea");
            return (Criteria) this;
        }

        public Criteria andHouseBareaNotIn(List<BigDecimal> values) {
            addCriterion("house_barea not in", values, "houseBarea");
            return (Criteria) this;
        }

        public Criteria andHouseBareaBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("house_barea between", value1, value2, "houseBarea");
            return (Criteria) this;
        }

        public Criteria andHouseBareaNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("house_barea not between", value1, value2, "houseBarea");
            return (Criteria) this;
        }

        public Criteria andHouseUareaIsNull() {
            addCriterion("house_uarea is null");
            return (Criteria) this;
        }

        public Criteria andHouseUareaIsNotNull() {
            addCriterion("house_uarea is not null");
            return (Criteria) this;
        }

        public Criteria andHouseUareaEqualTo(BigDecimal value) {
            addCriterion("house_uarea =", value, "houseUarea");
            return (Criteria) this;
        }

        public Criteria andHouseUareaNotEqualTo(BigDecimal value) {
            addCriterion("house_uarea <>", value, "houseUarea");
            return (Criteria) this;
        }

        public Criteria andHouseUareaGreaterThan(BigDecimal value) {
            addCriterion("house_uarea >", value, "houseUarea");
            return (Criteria) this;
        }

        public Criteria andHouseUareaGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("house_uarea >=", value, "houseUarea");
            return (Criteria) this;
        }

        public Criteria andHouseUareaLessThan(BigDecimal value) {
            addCriterion("house_uarea <", value, "houseUarea");
            return (Criteria) this;
        }

        public Criteria andHouseUareaLessThanOrEqualTo(BigDecimal value) {
            addCriterion("house_uarea <=", value, "houseUarea");
            return (Criteria) this;
        }

        public Criteria andHouseUareaIn(List<BigDecimal> values) {
            addCriterion("house_uarea in", values, "houseUarea");
            return (Criteria) this;
        }

        public Criteria andHouseUareaNotIn(List<BigDecimal> values) {
            addCriterion("house_uarea not in", values, "houseUarea");
            return (Criteria) this;
        }

        public Criteria andHouseUareaBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("house_uarea between", value1, value2, "houseUarea");
            return (Criteria) this;
        }

        public Criteria andHouseUareaNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("house_uarea not between", value1, value2, "houseUarea");
            return (Criteria) this;
        }

        public Criteria andHousePriceIsNull() {
            addCriterion("house_price is null");
            return (Criteria) this;
        }

        public Criteria andHousePriceIsNotNull() {
            addCriterion("house_price is not null");
            return (Criteria) this;
        }

        public Criteria andHousePriceEqualTo(BigDecimal value) {
            addCriterion("house_price =", value, "housePrice");
            return (Criteria) this;
        }

        public Criteria andHousePriceNotEqualTo(BigDecimal value) {
            addCriterion("house_price <>", value, "housePrice");
            return (Criteria) this;
        }

        public Criteria andHousePriceGreaterThan(BigDecimal value) {
            addCriterion("house_price >", value, "housePrice");
            return (Criteria) this;
        }

        public Criteria andHousePriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("house_price >=", value, "housePrice");
            return (Criteria) this;
        }

        public Criteria andHousePriceLessThan(BigDecimal value) {
            addCriterion("house_price <", value, "housePrice");
            return (Criteria) this;
        }

        public Criteria andHousePriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("house_price <=", value, "housePrice");
            return (Criteria) this;
        }

        public Criteria andHousePriceIn(List<BigDecimal> values) {
            addCriterion("house_price in", values, "housePrice");
            return (Criteria) this;
        }

        public Criteria andHousePriceNotIn(List<BigDecimal> values) {
            addCriterion("house_price not in", values, "housePrice");
            return (Criteria) this;
        }

        public Criteria andHousePriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("house_price between", value1, value2, "housePrice");
            return (Criteria) this;
        }

        public Criteria andHousePriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("house_price not between", value1, value2, "housePrice");
            return (Criteria) this;
        }

        public Criteria andHouseDirectionIsNull() {
            addCriterion("house_direction is null");
            return (Criteria) this;
        }

        public Criteria andHouseDirectionIsNotNull() {
            addCriterion("house_direction is not null");
            return (Criteria) this;
        }

        public Criteria andHouseDirectionEqualTo(String value) {
            addCriterion("house_direction =", value, "houseDirection");
            return (Criteria) this;
        }

        public Criteria andHouseDirectionNotEqualTo(String value) {
            addCriterion("house_direction <>", value, "houseDirection");
            return (Criteria) this;
        }

        public Criteria andHouseDirectionGreaterThan(String value) {
            addCriterion("house_direction >", value, "houseDirection");
            return (Criteria) this;
        }

        public Criteria andHouseDirectionGreaterThanOrEqualTo(String value) {
            addCriterion("house_direction >=", value, "houseDirection");
            return (Criteria) this;
        }

        public Criteria andHouseDirectionLessThan(String value) {
            addCriterion("house_direction <", value, "houseDirection");
            return (Criteria) this;
        }

        public Criteria andHouseDirectionLessThanOrEqualTo(String value) {
            addCriterion("house_direction <=", value, "houseDirection");
            return (Criteria) this;
        }

        public Criteria andHouseDirectionLike(String value) {
            addCriterion("house_direction like", value, "houseDirection");
            return (Criteria) this;
        }

        public Criteria andHouseDirectionNotLike(String value) {
            addCriterion("house_direction not like", value, "houseDirection");
            return (Criteria) this;
        }

        public Criteria andHouseDirectionIn(List<String> values) {
            addCriterion("house_direction in", values, "houseDirection");
            return (Criteria) this;
        }

        public Criteria andHouseDirectionNotIn(List<String> values) {
            addCriterion("house_direction not in", values, "houseDirection");
            return (Criteria) this;
        }

        public Criteria andHouseDirectionBetween(String value1, String value2) {
            addCriterion("house_direction between", value1, value2, "houseDirection");
            return (Criteria) this;
        }

        public Criteria andHouseDirectionNotBetween(String value1, String value2) {
            addCriterion("house_direction not between", value1, value2, "houseDirection");
            return (Criteria) this;
        }

        public Criteria andHouseTypeIsNull() {
            addCriterion("house_type is null");
            return (Criteria) this;
        }

        public Criteria andHouseTypeIsNotNull() {
            addCriterion("house_type is not null");
            return (Criteria) this;
        }

        public Criteria andHouseTypeEqualTo(String value) {
            addCriterion("house_type =", value, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeNotEqualTo(String value) {
            addCriterion("house_type <>", value, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeGreaterThan(String value) {
            addCriterion("house_type >", value, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeGreaterThanOrEqualTo(String value) {
            addCriterion("house_type >=", value, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeLessThan(String value) {
            addCriterion("house_type <", value, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeLessThanOrEqualTo(String value) {
            addCriterion("house_type <=", value, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeLike(String value) {
            addCriterion("house_type like", value, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeNotLike(String value) {
            addCriterion("house_type not like", value, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeIn(List<String> values) {
            addCriterion("house_type in", values, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeNotIn(List<String> values) {
            addCriterion("house_type not in", values, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeBetween(String value1, String value2) {
            addCriterion("house_type between", value1, value2, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeNotBetween(String value1, String value2) {
            addCriterion("house_type not between", value1, value2, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseStateIsNull() {
            addCriterion("house_state is null");
            return (Criteria) this;
        }

        public Criteria andHouseStateIsNotNull() {
            addCriterion("house_state is not null");
            return (Criteria) this;
        }

        public Criteria andHouseStateEqualTo(String value) {
            addCriterion("house_state =", value, "houseState");
            return (Criteria) this;
        }

        public Criteria andHouseStateNotEqualTo(String value) {
            addCriterion("house_state <>", value, "houseState");
            return (Criteria) this;
        }

        public Criteria andHouseStateGreaterThan(String value) {
            addCriterion("house_state >", value, "houseState");
            return (Criteria) this;
        }

        public Criteria andHouseStateGreaterThanOrEqualTo(String value) {
            addCriterion("house_state >=", value, "houseState");
            return (Criteria) this;
        }

        public Criteria andHouseStateLessThan(String value) {
            addCriterion("house_state <", value, "houseState");
            return (Criteria) this;
        }

        public Criteria andHouseStateLessThanOrEqualTo(String value) {
            addCriterion("house_state <=", value, "houseState");
            return (Criteria) this;
        }

        public Criteria andHouseStateLike(String value) {
            addCriterion("house_state like", value, "houseState");
            return (Criteria) this;
        }

        public Criteria andHouseStateNotLike(String value) {
            addCriterion("house_state not like", value, "houseState");
            return (Criteria) this;
        }

        public Criteria andHouseStateIn(List<String> values) {
            addCriterion("house_state in", values, "houseState");
            return (Criteria) this;
        }

        public Criteria andHouseStateNotIn(List<String> values) {
            addCriterion("house_state not in", values, "houseState");
            return (Criteria) this;
        }

        public Criteria andHouseStateBetween(String value1, String value2) {
            addCriterion("house_state between", value1, value2, "houseState");
            return (Criteria) this;
        }

        public Criteria andHouseStateNotBetween(String value1, String value2) {
            addCriterion("house_state not between", value1, value2, "houseState");
            return (Criteria) this;
        }

        public Criteria andHouseQualityIsNull() {
            addCriterion("house_quality is null");
            return (Criteria) this;
        }

        public Criteria andHouseQualityIsNotNull() {
            addCriterion("house_quality is not null");
            return (Criteria) this;
        }

        public Criteria andHouseQualityEqualTo(String value) {
            addCriterion("house_quality =", value, "houseQuality");
            return (Criteria) this;
        }

        public Criteria andHouseQualityNotEqualTo(String value) {
            addCriterion("house_quality <>", value, "houseQuality");
            return (Criteria) this;
        }

        public Criteria andHouseQualityGreaterThan(String value) {
            addCriterion("house_quality >", value, "houseQuality");
            return (Criteria) this;
        }

        public Criteria andHouseQualityGreaterThanOrEqualTo(String value) {
            addCriterion("house_quality >=", value, "houseQuality");
            return (Criteria) this;
        }

        public Criteria andHouseQualityLessThan(String value) {
            addCriterion("house_quality <", value, "houseQuality");
            return (Criteria) this;
        }

        public Criteria andHouseQualityLessThanOrEqualTo(String value) {
            addCriterion("house_quality <=", value, "houseQuality");
            return (Criteria) this;
        }

        public Criteria andHouseQualityLike(String value) {
            addCriterion("house_quality like", value, "houseQuality");
            return (Criteria) this;
        }

        public Criteria andHouseQualityNotLike(String value) {
            addCriterion("house_quality not like", value, "houseQuality");
            return (Criteria) this;
        }

        public Criteria andHouseQualityIn(List<String> values) {
            addCriterion("house_quality in", values, "houseQuality");
            return (Criteria) this;
        }

        public Criteria andHouseQualityNotIn(List<String> values) {
            addCriterion("house_quality not in", values, "houseQuality");
            return (Criteria) this;
        }

        public Criteria andHouseQualityBetween(String value1, String value2) {
            addCriterion("house_quality between", value1, value2, "houseQuality");
            return (Criteria) this;
        }

        public Criteria andHouseQualityNotBetween(String value1, String value2) {
            addCriterion("house_quality not between", value1, value2, "houseQuality");
            return (Criteria) this;
        }

        public Criteria andHouseMemoIsNull() {
            addCriterion("house_memo is null");
            return (Criteria) this;
        }

        public Criteria andHouseMemoIsNotNull() {
            addCriterion("house_memo is not null");
            return (Criteria) this;
        }

        public Criteria andHouseMemoEqualTo(String value) {
            addCriterion("house_memo =", value, "houseMemo");
            return (Criteria) this;
        }

        public Criteria andHouseMemoNotEqualTo(String value) {
            addCriterion("house_memo <>", value, "houseMemo");
            return (Criteria) this;
        }

        public Criteria andHouseMemoGreaterThan(String value) {
            addCriterion("house_memo >", value, "houseMemo");
            return (Criteria) this;
        }

        public Criteria andHouseMemoGreaterThanOrEqualTo(String value) {
            addCriterion("house_memo >=", value, "houseMemo");
            return (Criteria) this;
        }

        public Criteria andHouseMemoLessThan(String value) {
            addCriterion("house_memo <", value, "houseMemo");
            return (Criteria) this;
        }

        public Criteria andHouseMemoLessThanOrEqualTo(String value) {
            addCriterion("house_memo <=", value, "houseMemo");
            return (Criteria) this;
        }

        public Criteria andHouseMemoLike(String value) {
            addCriterion("house_memo like", value, "houseMemo");
            return (Criteria) this;
        }

        public Criteria andHouseMemoNotLike(String value) {
            addCriterion("house_memo not like", value, "houseMemo");
            return (Criteria) this;
        }

        public Criteria andHouseMemoIn(List<String> values) {
            addCriterion("house_memo in", values, "houseMemo");
            return (Criteria) this;
        }

        public Criteria andHouseMemoNotIn(List<String> values) {
            addCriterion("house_memo not in", values, "houseMemo");
            return (Criteria) this;
        }

        public Criteria andHouseMemoBetween(String value1, String value2) {
            addCriterion("house_memo between", value1, value2, "houseMemo");
            return (Criteria) this;
        }

        public Criteria andHouseMemoNotBetween(String value1, String value2) {
            addCriterion("house_memo not between", value1, value2, "houseMemo");
            return (Criteria) this;
        }

        public Criteria andHouseKongzhiyyIsNull() {
            addCriterion("house_kongzhiyy is null");
            return (Criteria) this;
        }

        public Criteria andHouseKongzhiyyIsNotNull() {
            addCriterion("house_kongzhiyy is not null");
            return (Criteria) this;
        }

        public Criteria andHouseKongzhiyyEqualTo(String value) {
            addCriterion("house_kongzhiyy =", value, "houseKongzhiyy");
            return (Criteria) this;
        }

        public Criteria andHouseKongzhiyyNotEqualTo(String value) {
            addCriterion("house_kongzhiyy <>", value, "houseKongzhiyy");
            return (Criteria) this;
        }

        public Criteria andHouseKongzhiyyGreaterThan(String value) {
            addCriterion("house_kongzhiyy >", value, "houseKongzhiyy");
            return (Criteria) this;
        }

        public Criteria andHouseKongzhiyyGreaterThanOrEqualTo(String value) {
            addCriterion("house_kongzhiyy >=", value, "houseKongzhiyy");
            return (Criteria) this;
        }

        public Criteria andHouseKongzhiyyLessThan(String value) {
            addCriterion("house_kongzhiyy <", value, "houseKongzhiyy");
            return (Criteria) this;
        }

        public Criteria andHouseKongzhiyyLessThanOrEqualTo(String value) {
            addCriterion("house_kongzhiyy <=", value, "houseKongzhiyy");
            return (Criteria) this;
        }

        public Criteria andHouseKongzhiyyLike(String value) {
            addCriterion("house_kongzhiyy like", value, "houseKongzhiyy");
            return (Criteria) this;
        }

        public Criteria andHouseKongzhiyyNotLike(String value) {
            addCriterion("house_kongzhiyy not like", value, "houseKongzhiyy");
            return (Criteria) this;
        }

        public Criteria andHouseKongzhiyyIn(List<String> values) {
            addCriterion("house_kongzhiyy in", values, "houseKongzhiyy");
            return (Criteria) this;
        }

        public Criteria andHouseKongzhiyyNotIn(List<String> values) {
            addCriterion("house_kongzhiyy not in", values, "houseKongzhiyy");
            return (Criteria) this;
        }

        public Criteria andHouseKongzhiyyBetween(String value1, String value2) {
            addCriterion("house_kongzhiyy between", value1, value2, "houseKongzhiyy");
            return (Criteria) this;
        }

        public Criteria andHouseKongzhiyyNotBetween(String value1, String value2) {
            addCriterion("house_kongzhiyy not between", value1, value2, "houseKongzhiyy");
            return (Criteria) this;
        }

        public Criteria andHouseDengcengIsNull() {
            addCriterion("house_dengceng is null");
            return (Criteria) this;
        }

        public Criteria andHouseDengcengIsNotNull() {
            addCriterion("house_dengceng is not null");
            return (Criteria) this;
        }

        public Criteria andHouseDengcengEqualTo(String value) {
            addCriterion("house_dengceng =", value, "houseDengceng");
            return (Criteria) this;
        }

        public Criteria andHouseDengcengNotEqualTo(String value) {
            addCriterion("house_dengceng <>", value, "houseDengceng");
            return (Criteria) this;
        }

        public Criteria andHouseDengcengGreaterThan(String value) {
            addCriterion("house_dengceng >", value, "houseDengceng");
            return (Criteria) this;
        }

        public Criteria andHouseDengcengGreaterThanOrEqualTo(String value) {
            addCriterion("house_dengceng >=", value, "houseDengceng");
            return (Criteria) this;
        }

        public Criteria andHouseDengcengLessThan(String value) {
            addCriterion("house_dengceng <", value, "houseDengceng");
            return (Criteria) this;
        }

        public Criteria andHouseDengcengLessThanOrEqualTo(String value) {
            addCriterion("house_dengceng <=", value, "houseDengceng");
            return (Criteria) this;
        }

        public Criteria andHouseDengcengLike(String value) {
            addCriterion("house_dengceng like", value, "houseDengceng");
            return (Criteria) this;
        }

        public Criteria andHouseDengcengNotLike(String value) {
            addCriterion("house_dengceng not like", value, "houseDengceng");
            return (Criteria) this;
        }

        public Criteria andHouseDengcengIn(List<String> values) {
            addCriterion("house_dengceng in", values, "houseDengceng");
            return (Criteria) this;
        }

        public Criteria andHouseDengcengNotIn(List<String> values) {
            addCriterion("house_dengceng not in", values, "houseDengceng");
            return (Criteria) this;
        }

        public Criteria andHouseDengcengBetween(String value1, String value2) {
            addCriterion("house_dengceng between", value1, value2, "houseDengceng");
            return (Criteria) this;
        }

        public Criteria andHouseDengcengNotBetween(String value1, String value2) {
            addCriterion("house_dengceng not between", value1, value2, "houseDengceng");
            return (Criteria) this;
        }

        public Criteria andHouseDicengIsNull() {
            addCriterion("house_diceng is null");
            return (Criteria) this;
        }

        public Criteria andHouseDicengIsNotNull() {
            addCriterion("house_diceng is not null");
            return (Criteria) this;
        }

        public Criteria andHouseDicengEqualTo(String value) {
            addCriterion("house_diceng =", value, "houseDiceng");
            return (Criteria) this;
        }

        public Criteria andHouseDicengNotEqualTo(String value) {
            addCriterion("house_diceng <>", value, "houseDiceng");
            return (Criteria) this;
        }

        public Criteria andHouseDicengGreaterThan(String value) {
            addCriterion("house_diceng >", value, "houseDiceng");
            return (Criteria) this;
        }

        public Criteria andHouseDicengGreaterThanOrEqualTo(String value) {
            addCriterion("house_diceng >=", value, "houseDiceng");
            return (Criteria) this;
        }

        public Criteria andHouseDicengLessThan(String value) {
            addCriterion("house_diceng <", value, "houseDiceng");
            return (Criteria) this;
        }

        public Criteria andHouseDicengLessThanOrEqualTo(String value) {
            addCriterion("house_diceng <=", value, "houseDiceng");
            return (Criteria) this;
        }

        public Criteria andHouseDicengLike(String value) {
            addCriterion("house_diceng like", value, "houseDiceng");
            return (Criteria) this;
        }

        public Criteria andHouseDicengNotLike(String value) {
            addCriterion("house_diceng not like", value, "houseDiceng");
            return (Criteria) this;
        }

        public Criteria andHouseDicengIn(List<String> values) {
            addCriterion("house_diceng in", values, "houseDiceng");
            return (Criteria) this;
        }

        public Criteria andHouseDicengNotIn(List<String> values) {
            addCriterion("house_diceng not in", values, "houseDiceng");
            return (Criteria) this;
        }

        public Criteria andHouseDicengBetween(String value1, String value2) {
            addCriterion("house_diceng between", value1, value2, "houseDiceng");
            return (Criteria) this;
        }

        public Criteria andHouseDicengNotBetween(String value1, String value2) {
            addCriterion("house_diceng not between", value1, value2, "houseDiceng");
            return (Criteria) this;
        }

        public Criteria andHouseXishaiIsNull() {
            addCriterion("house_xishai is null");
            return (Criteria) this;
        }

        public Criteria andHouseXishaiIsNotNull() {
            addCriterion("house_xishai is not null");
            return (Criteria) this;
        }

        public Criteria andHouseXishaiEqualTo(String value) {
            addCriterion("house_xishai =", value, "houseXishai");
            return (Criteria) this;
        }

        public Criteria andHouseXishaiNotEqualTo(String value) {
            addCriterion("house_xishai <>", value, "houseXishai");
            return (Criteria) this;
        }

        public Criteria andHouseXishaiGreaterThan(String value) {
            addCriterion("house_xishai >", value, "houseXishai");
            return (Criteria) this;
        }

        public Criteria andHouseXishaiGreaterThanOrEqualTo(String value) {
            addCriterion("house_xishai >=", value, "houseXishai");
            return (Criteria) this;
        }

        public Criteria andHouseXishaiLessThan(String value) {
            addCriterion("house_xishai <", value, "houseXishai");
            return (Criteria) this;
        }

        public Criteria andHouseXishaiLessThanOrEqualTo(String value) {
            addCriterion("house_xishai <=", value, "houseXishai");
            return (Criteria) this;
        }

        public Criteria andHouseXishaiLike(String value) {
            addCriterion("house_xishai like", value, "houseXishai");
            return (Criteria) this;
        }

        public Criteria andHouseXishaiNotLike(String value) {
            addCriterion("house_xishai not like", value, "houseXishai");
            return (Criteria) this;
        }

        public Criteria andHouseXishaiIn(List<String> values) {
            addCriterion("house_xishai in", values, "houseXishai");
            return (Criteria) this;
        }

        public Criteria andHouseXishaiNotIn(List<String> values) {
            addCriterion("house_xishai not in", values, "houseXishai");
            return (Criteria) this;
        }

        public Criteria andHouseXishaiBetween(String value1, String value2) {
            addCriterion("house_xishai between", value1, value2, "houseXishai");
            return (Criteria) this;
        }

        public Criteria andHouseXishaiNotBetween(String value1, String value2) {
            addCriterion("house_xishai not between", value1, value2, "houseXishai");
            return (Criteria) this;
        }

        public Criteria andHouseQtyhIsNull() {
            addCriterion("house_qtyh is null");
            return (Criteria) this;
        }

        public Criteria andHouseQtyhIsNotNull() {
            addCriterion("house_qtyh is not null");
            return (Criteria) this;
        }

        public Criteria andHouseQtyhEqualTo(String value) {
            addCriterion("house_qtyh =", value, "houseQtyh");
            return (Criteria) this;
        }

        public Criteria andHouseQtyhNotEqualTo(String value) {
            addCriterion("house_qtyh <>", value, "houseQtyh");
            return (Criteria) this;
        }

        public Criteria andHouseQtyhGreaterThan(String value) {
            addCriterion("house_qtyh >", value, "houseQtyh");
            return (Criteria) this;
        }

        public Criteria andHouseQtyhGreaterThanOrEqualTo(String value) {
            addCriterion("house_qtyh >=", value, "houseQtyh");
            return (Criteria) this;
        }

        public Criteria andHouseQtyhLessThan(String value) {
            addCriterion("house_qtyh <", value, "houseQtyh");
            return (Criteria) this;
        }

        public Criteria andHouseQtyhLessThanOrEqualTo(String value) {
            addCriterion("house_qtyh <=", value, "houseQtyh");
            return (Criteria) this;
        }

        public Criteria andHouseQtyhLike(String value) {
            addCriterion("house_qtyh like", value, "houseQtyh");
            return (Criteria) this;
        }

        public Criteria andHouseQtyhNotLike(String value) {
            addCriterion("house_qtyh not like", value, "houseQtyh");
            return (Criteria) this;
        }

        public Criteria andHouseQtyhIn(List<String> values) {
            addCriterion("house_qtyh in", values, "houseQtyh");
            return (Criteria) this;
        }

        public Criteria andHouseQtyhNotIn(List<String> values) {
            addCriterion("house_qtyh not in", values, "houseQtyh");
            return (Criteria) this;
        }

        public Criteria andHouseQtyhBetween(String value1, String value2) {
            addCriterion("house_qtyh between", value1, value2, "houseQtyh");
            return (Criteria) this;
        }

        public Criteria andHouseQtyhNotBetween(String value1, String value2) {
            addCriterion("house_qtyh not between", value1, value2, "houseQtyh");
            return (Criteria) this;
        }

        public Criteria andHouseJyrcIsNull() {
            addCriterion("house_jyrc is null");
            return (Criteria) this;
        }

        public Criteria andHouseJyrcIsNotNull() {
            addCriterion("house_jyrc is not null");
            return (Criteria) this;
        }

        public Criteria andHouseJyrcEqualTo(String value) {
            addCriterion("house_jyrc =", value, "houseJyrc");
            return (Criteria) this;
        }

        public Criteria andHouseJyrcNotEqualTo(String value) {
            addCriterion("house_jyrc <>", value, "houseJyrc");
            return (Criteria) this;
        }

        public Criteria andHouseJyrcGreaterThan(String value) {
            addCriterion("house_jyrc >", value, "houseJyrc");
            return (Criteria) this;
        }

        public Criteria andHouseJyrcGreaterThanOrEqualTo(String value) {
            addCriterion("house_jyrc >=", value, "houseJyrc");
            return (Criteria) this;
        }

        public Criteria andHouseJyrcLessThan(String value) {
            addCriterion("house_jyrc <", value, "houseJyrc");
            return (Criteria) this;
        }

        public Criteria andHouseJyrcLessThanOrEqualTo(String value) {
            addCriterion("house_jyrc <=", value, "houseJyrc");
            return (Criteria) this;
        }

        public Criteria andHouseJyrcLike(String value) {
            addCriterion("house_jyrc like", value, "houseJyrc");
            return (Criteria) this;
        }

        public Criteria andHouseJyrcNotLike(String value) {
            addCriterion("house_jyrc not like", value, "houseJyrc");
            return (Criteria) this;
        }

        public Criteria andHouseJyrcIn(List<String> values) {
            addCriterion("house_jyrc in", values, "houseJyrc");
            return (Criteria) this;
        }

        public Criteria andHouseJyrcNotIn(List<String> values) {
            addCriterion("house_jyrc not in", values, "houseJyrc");
            return (Criteria) this;
        }

        public Criteria andHouseJyrcBetween(String value1, String value2) {
            addCriterion("house_jyrc between", value1, value2, "houseJyrc");
            return (Criteria) this;
        }

        public Criteria andHouseJyrcNotBetween(String value1, String value2) {
            addCriterion("house_jyrc not between", value1, value2, "houseJyrc");
            return (Criteria) this;
        }

        public Criteria andHouseJyrIsNull() {
            addCriterion("house_jyr is null");
            return (Criteria) this;
        }

        public Criteria andHouseJyrIsNotNull() {
            addCriterion("house_jyr is not null");
            return (Criteria) this;
        }

        public Criteria andHouseJyrEqualTo(String value) {
            addCriterion("house_jyr =", value, "houseJyr");
            return (Criteria) this;
        }

        public Criteria andHouseJyrNotEqualTo(String value) {
            addCriterion("house_jyr <>", value, "houseJyr");
            return (Criteria) this;
        }

        public Criteria andHouseJyrGreaterThan(String value) {
            addCriterion("house_jyr >", value, "houseJyr");
            return (Criteria) this;
        }

        public Criteria andHouseJyrGreaterThanOrEqualTo(String value) {
            addCriterion("house_jyr >=", value, "houseJyr");
            return (Criteria) this;
        }

        public Criteria andHouseJyrLessThan(String value) {
            addCriterion("house_jyr <", value, "houseJyr");
            return (Criteria) this;
        }

        public Criteria andHouseJyrLessThanOrEqualTo(String value) {
            addCriterion("house_jyr <=", value, "houseJyr");
            return (Criteria) this;
        }

        public Criteria andHouseJyrLike(String value) {
            addCriterion("house_jyr like", value, "houseJyr");
            return (Criteria) this;
        }

        public Criteria andHouseJyrNotLike(String value) {
            addCriterion("house_jyr not like", value, "houseJyr");
            return (Criteria) this;
        }

        public Criteria andHouseJyrIn(List<String> values) {
            addCriterion("house_jyr in", values, "houseJyr");
            return (Criteria) this;
        }

        public Criteria andHouseJyrNotIn(List<String> values) {
            addCriterion("house_jyr not in", values, "houseJyr");
            return (Criteria) this;
        }

        public Criteria andHouseJyrBetween(String value1, String value2) {
            addCriterion("house_jyr between", value1, value2, "houseJyr");
            return (Criteria) this;
        }

        public Criteria andHouseJyrNotBetween(String value1, String value2) {
            addCriterion("house_jyr not between", value1, value2, "houseJyr");
            return (Criteria) this;
        }

        public Criteria andHouseJjxsIsNull() {
            addCriterion("house_jjxs is null");
            return (Criteria) this;
        }

        public Criteria andHouseJjxsIsNotNull() {
            addCriterion("house_jjxs is not null");
            return (Criteria) this;
        }

        public Criteria andHouseJjxsEqualTo(BigDecimal value) {
            addCriterion("house_jjxs =", value, "houseJjxs");
            return (Criteria) this;
        }

        public Criteria andHouseJjxsNotEqualTo(BigDecimal value) {
            addCriterion("house_jjxs <>", value, "houseJjxs");
            return (Criteria) this;
        }

        public Criteria andHouseJjxsGreaterThan(BigDecimal value) {
            addCriterion("house_jjxs >", value, "houseJjxs");
            return (Criteria) this;
        }

        public Criteria andHouseJjxsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("house_jjxs >=", value, "houseJjxs");
            return (Criteria) this;
        }

        public Criteria andHouseJjxsLessThan(BigDecimal value) {
            addCriterion("house_jjxs <", value, "houseJjxs");
            return (Criteria) this;
        }

        public Criteria andHouseJjxsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("house_jjxs <=", value, "houseJjxs");
            return (Criteria) this;
        }

        public Criteria andHouseJjxsIn(List<BigDecimal> values) {
            addCriterion("house_jjxs in", values, "houseJjxs");
            return (Criteria) this;
        }

        public Criteria andHouseJjxsNotIn(List<BigDecimal> values) {
            addCriterion("house_jjxs not in", values, "houseJjxs");
            return (Criteria) this;
        }

        public Criteria andHouseJjxsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("house_jjxs between", value1, value2, "houseJjxs");
            return (Criteria) this;
        }

        public Criteria andHouseJjxsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("house_jjxs not between", value1, value2, "houseJjxs");
            return (Criteria) this;
        }

        public Criteria andHouseYzxsIsNull() {
            addCriterion("house_yzxs is null");
            return (Criteria) this;
        }

        public Criteria andHouseYzxsIsNotNull() {
            addCriterion("house_yzxs is not null");
            return (Criteria) this;
        }

        public Criteria andHouseYzxsEqualTo(BigDecimal value) {
            addCriterion("house_yzxs =", value, "houseYzxs");
            return (Criteria) this;
        }

        public Criteria andHouseYzxsNotEqualTo(BigDecimal value) {
            addCriterion("house_yzxs <>", value, "houseYzxs");
            return (Criteria) this;
        }

        public Criteria andHouseYzxsGreaterThan(BigDecimal value) {
            addCriterion("house_yzxs >", value, "houseYzxs");
            return (Criteria) this;
        }

        public Criteria andHouseYzxsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("house_yzxs >=", value, "houseYzxs");
            return (Criteria) this;
        }

        public Criteria andHouseYzxsLessThan(BigDecimal value) {
            addCriterion("house_yzxs <", value, "houseYzxs");
            return (Criteria) this;
        }

        public Criteria andHouseYzxsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("house_yzxs <=", value, "houseYzxs");
            return (Criteria) this;
        }

        public Criteria andHouseYzxsIn(List<BigDecimal> values) {
            addCriterion("house_yzxs in", values, "houseYzxs");
            return (Criteria) this;
        }

        public Criteria andHouseYzxsNotIn(List<BigDecimal> values) {
            addCriterion("house_yzxs not in", values, "houseYzxs");
            return (Criteria) this;
        }

        public Criteria andHouseYzxsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("house_yzxs between", value1, value2, "houseYzxs");
            return (Criteria) this;
        }

        public Criteria andHouseYzxsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("house_yzxs not between", value1, value2, "houseYzxs");
            return (Criteria) this;
        }

        public Criteria andHouseSyjjxsIsNull() {
            addCriterion("house_syjjxs is null");
            return (Criteria) this;
        }

        public Criteria andHouseSyjjxsIsNotNull() {
            addCriterion("house_syjjxs is not null");
            return (Criteria) this;
        }

        public Criteria andHouseSyjjxsEqualTo(BigDecimal value) {
            addCriterion("house_syjjxs =", value, "houseSyjjxs");
            return (Criteria) this;
        }

        public Criteria andHouseSyjjxsNotEqualTo(BigDecimal value) {
            addCriterion("house_syjjxs <>", value, "houseSyjjxs");
            return (Criteria) this;
        }

        public Criteria andHouseSyjjxsGreaterThan(BigDecimal value) {
            addCriterion("house_syjjxs >", value, "houseSyjjxs");
            return (Criteria) this;
        }

        public Criteria andHouseSyjjxsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("house_syjjxs >=", value, "houseSyjjxs");
            return (Criteria) this;
        }

        public Criteria andHouseSyjjxsLessThan(BigDecimal value) {
            addCriterion("house_syjjxs <", value, "houseSyjjxs");
            return (Criteria) this;
        }

        public Criteria andHouseSyjjxsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("house_syjjxs <=", value, "houseSyjjxs");
            return (Criteria) this;
        }

        public Criteria andHouseSyjjxsIn(List<BigDecimal> values) {
            addCriterion("house_syjjxs in", values, "houseSyjjxs");
            return (Criteria) this;
        }

        public Criteria andHouseSyjjxsNotIn(List<BigDecimal> values) {
            addCriterion("house_syjjxs not in", values, "houseSyjjxs");
            return (Criteria) this;
        }

        public Criteria andHouseSyjjxsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("house_syjjxs between", value1, value2, "houseSyjjxs");
            return (Criteria) this;
        }

        public Criteria andHouseSyjjxsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("house_syjjxs not between", value1, value2, "houseSyjjxs");
            return (Criteria) this;
        }

        public Criteria andHouseZujinIsNull() {
            addCriterion("house_zujin is null");
            return (Criteria) this;
        }

        public Criteria andHouseZujinIsNotNull() {
            addCriterion("house_zujin is not null");
            return (Criteria) this;
        }

        public Criteria andHouseZujinEqualTo(BigDecimal value) {
            addCriterion("house_zujin =", value, "houseZujin");
            return (Criteria) this;
        }

        public Criteria andHouseZujinNotEqualTo(BigDecimal value) {
            addCriterion("house_zujin <>", value, "houseZujin");
            return (Criteria) this;
        }

        public Criteria andHouseZujinGreaterThan(BigDecimal value) {
            addCriterion("house_zujin >", value, "houseZujin");
            return (Criteria) this;
        }

        public Criteria andHouseZujinGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("house_zujin >=", value, "houseZujin");
            return (Criteria) this;
        }

        public Criteria andHouseZujinLessThan(BigDecimal value) {
            addCriterion("house_zujin <", value, "houseZujin");
            return (Criteria) this;
        }

        public Criteria andHouseZujinLessThanOrEqualTo(BigDecimal value) {
            addCriterion("house_zujin <=", value, "houseZujin");
            return (Criteria) this;
        }

        public Criteria andHouseZujinIn(List<BigDecimal> values) {
            addCriterion("house_zujin in", values, "houseZujin");
            return (Criteria) this;
        }

        public Criteria andHouseZujinNotIn(List<BigDecimal> values) {
            addCriterion("house_zujin not in", values, "houseZujin");
            return (Criteria) this;
        }

        public Criteria andHouseZujinBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("house_zujin between", value1, value2, "houseZujin");
            return (Criteria) this;
        }

        public Criteria andHouseZujinNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("house_zujin not between", value1, value2, "houseZujin");
            return (Criteria) this;
        }

        public Criteria andHouseLouctjIsNull() {
            addCriterion("house_louctj is null");
            return (Criteria) this;
        }

        public Criteria andHouseLouctjIsNotNull() {
            addCriterion("house_louctj is not null");
            return (Criteria) this;
        }

        public Criteria andHouseLouctjEqualTo(BigDecimal value) {
            addCriterion("house_louctj =", value, "houseLouctj");
            return (Criteria) this;
        }

        public Criteria andHouseLouctjNotEqualTo(BigDecimal value) {
            addCriterion("house_louctj <>", value, "houseLouctj");
            return (Criteria) this;
        }

        public Criteria andHouseLouctjGreaterThan(BigDecimal value) {
            addCriterion("house_louctj >", value, "houseLouctj");
            return (Criteria) this;
        }

        public Criteria andHouseLouctjGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("house_louctj >=", value, "houseLouctj");
            return (Criteria) this;
        }

        public Criteria andHouseLouctjLessThan(BigDecimal value) {
            addCriterion("house_louctj <", value, "houseLouctj");
            return (Criteria) this;
        }

        public Criteria andHouseLouctjLessThanOrEqualTo(BigDecimal value) {
            addCriterion("house_louctj <=", value, "houseLouctj");
            return (Criteria) this;
        }

        public Criteria andHouseLouctjIn(List<BigDecimal> values) {
            addCriterion("house_louctj in", values, "houseLouctj");
            return (Criteria) this;
        }

        public Criteria andHouseLouctjNotIn(List<BigDecimal> values) {
            addCriterion("house_louctj not in", values, "houseLouctj");
            return (Criteria) this;
        }

        public Criteria andHouseLouctjBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("house_louctj between", value1, value2, "houseLouctj");
            return (Criteria) this;
        }

        public Criteria andHouseLouctjNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("house_louctj not between", value1, value2, "houseLouctj");
            return (Criteria) this;
        }

        public Criteria andHouseFangwtjIsNull() {
            addCriterion("house_fangwtj is null");
            return (Criteria) this;
        }

        public Criteria andHouseFangwtjIsNotNull() {
            addCriterion("house_fangwtj is not null");
            return (Criteria) this;
        }

        public Criteria andHouseFangwtjEqualTo(BigDecimal value) {
            addCriterion("house_fangwtj =", value, "houseFangwtj");
            return (Criteria) this;
        }

        public Criteria andHouseFangwtjNotEqualTo(BigDecimal value) {
            addCriterion("house_fangwtj <>", value, "houseFangwtj");
            return (Criteria) this;
        }

        public Criteria andHouseFangwtjGreaterThan(BigDecimal value) {
            addCriterion("house_fangwtj >", value, "houseFangwtj");
            return (Criteria) this;
        }

        public Criteria andHouseFangwtjGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("house_fangwtj >=", value, "houseFangwtj");
            return (Criteria) this;
        }

        public Criteria andHouseFangwtjLessThan(BigDecimal value) {
            addCriterion("house_fangwtj <", value, "houseFangwtj");
            return (Criteria) this;
        }

        public Criteria andHouseFangwtjLessThanOrEqualTo(BigDecimal value) {
            addCriterion("house_fangwtj <=", value, "houseFangwtj");
            return (Criteria) this;
        }

        public Criteria andHouseFangwtjIn(List<BigDecimal> values) {
            addCriterion("house_fangwtj in", values, "houseFangwtj");
            return (Criteria) this;
        }

        public Criteria andHouseFangwtjNotIn(List<BigDecimal> values) {
            addCriterion("house_fangwtj not in", values, "houseFangwtj");
            return (Criteria) this;
        }

        public Criteria andHouseFangwtjBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("house_fangwtj between", value1, value2, "houseFangwtj");
            return (Criteria) this;
        }

        public Criteria andHouseFangwtjNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("house_fangwtj not between", value1, value2, "houseFangwtj");
            return (Criteria) this;
        }

        public Criteria andYxwxIsNull() {
            addCriterion("yxwx is null");
            return (Criteria) this;
        }

        public Criteria andYxwxIsNotNull() {
            addCriterion("yxwx is not null");
            return (Criteria) this;
        }

        public Criteria andYxwxEqualTo(String value) {
            addCriterion("yxwx =", value, "yxwx");
            return (Criteria) this;
        }

        public Criteria andYxwxNotEqualTo(String value) {
            addCriterion("yxwx <>", value, "yxwx");
            return (Criteria) this;
        }

        public Criteria andYxwxGreaterThan(String value) {
            addCriterion("yxwx >", value, "yxwx");
            return (Criteria) this;
        }

        public Criteria andYxwxGreaterThanOrEqualTo(String value) {
            addCriterion("yxwx >=", value, "yxwx");
            return (Criteria) this;
        }

        public Criteria andYxwxLessThan(String value) {
            addCriterion("yxwx <", value, "yxwx");
            return (Criteria) this;
        }

        public Criteria andYxwxLessThanOrEqualTo(String value) {
            addCriterion("yxwx <=", value, "yxwx");
            return (Criteria) this;
        }

        public Criteria andYxwxLike(String value) {
            addCriterion("yxwx like", value, "yxwx");
            return (Criteria) this;
        }

        public Criteria andYxwxNotLike(String value) {
            addCriterion("yxwx not like", value, "yxwx");
            return (Criteria) this;
        }

        public Criteria andYxwxIn(List<String> values) {
            addCriterion("yxwx in", values, "yxwx");
            return (Criteria) this;
        }

        public Criteria andYxwxNotIn(List<String> values) {
            addCriterion("yxwx not in", values, "yxwx");
            return (Criteria) this;
        }

        public Criteria andYxwxBetween(String value1, String value2) {
            addCriterion("yxwx between", value1, value2, "yxwx");
            return (Criteria) this;
        }

        public Criteria andYxwxNotBetween(String value1, String value2) {
            addCriterion("yxwx not between", value1, value2, "yxwx");
            return (Criteria) this;
        }

        public Criteria andFysxIsNull() {
            addCriterion("fysx is null");
            return (Criteria) this;
        }

        public Criteria andFysxIsNotNull() {
            addCriterion("fysx is not null");
            return (Criteria) this;
        }

        public Criteria andFysxEqualTo(String value) {
            addCriterion("fysx =", value, "fysx");
            return (Criteria) this;
        }

        public Criteria andFysxNotEqualTo(String value) {
            addCriterion("fysx <>", value, "fysx");
            return (Criteria) this;
        }

        public Criteria andFysxGreaterThan(String value) {
            addCriterion("fysx >", value, "fysx");
            return (Criteria) this;
        }

        public Criteria andFysxGreaterThanOrEqualTo(String value) {
            addCriterion("fysx >=", value, "fysx");
            return (Criteria) this;
        }

        public Criteria andFysxLessThan(String value) {
            addCriterion("fysx <", value, "fysx");
            return (Criteria) this;
        }

        public Criteria andFysxLessThanOrEqualTo(String value) {
            addCriterion("fysx <=", value, "fysx");
            return (Criteria) this;
        }

        public Criteria andFysxLike(String value) {
            addCriterion("fysx like", value, "fysx");
            return (Criteria) this;
        }

        public Criteria andFysxNotLike(String value) {
            addCriterion("fysx not like", value, "fysx");
            return (Criteria) this;
        }

        public Criteria andFysxIn(List<String> values) {
            addCriterion("fysx in", values, "fysx");
            return (Criteria) this;
        }

        public Criteria andFysxNotIn(List<String> values) {
            addCriterion("fysx not in", values, "fysx");
            return (Criteria) this;
        }

        public Criteria andFysxBetween(String value1, String value2) {
            addCriterion("fysx between", value1, value2, "fysx");
            return (Criteria) this;
        }

        public Criteria andFysxNotBetween(String value1, String value2) {
            addCriterion("fysx not between", value1, value2, "fysx");
            return (Criteria) this;
        }

        public Criteria andCzzjIsNull() {
            addCriterion("czzj is null");
            return (Criteria) this;
        }

        public Criteria andCzzjIsNotNull() {
            addCriterion("czzj is not null");
            return (Criteria) this;
        }

        public Criteria andCzzjEqualTo(BigDecimal value) {
            addCriterion("czzj =", value, "czzj");
            return (Criteria) this;
        }

        public Criteria andCzzjNotEqualTo(BigDecimal value) {
            addCriterion("czzj <>", value, "czzj");
            return (Criteria) this;
        }

        public Criteria andCzzjGreaterThan(BigDecimal value) {
            addCriterion("czzj >", value, "czzj");
            return (Criteria) this;
        }

        public Criteria andCzzjGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("czzj >=", value, "czzj");
            return (Criteria) this;
        }

        public Criteria andCzzjLessThan(BigDecimal value) {
            addCriterion("czzj <", value, "czzj");
            return (Criteria) this;
        }

        public Criteria andCzzjLessThanOrEqualTo(BigDecimal value) {
            addCriterion("czzj <=", value, "czzj");
            return (Criteria) this;
        }

        public Criteria andCzzjIn(List<BigDecimal> values) {
            addCriterion("czzj in", values, "czzj");
            return (Criteria) this;
        }

        public Criteria andCzzjNotIn(List<BigDecimal> values) {
            addCriterion("czzj not in", values, "czzj");
            return (Criteria) this;
        }

        public Criteria andCzzjBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("czzj between", value1, value2, "czzj");
            return (Criteria) this;
        }

        public Criteria andCzzjNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("czzj not between", value1, value2, "czzj");
            return (Criteria) this;
        }

        public Criteria andWyfIsNull() {
            addCriterion("wyf is null");
            return (Criteria) this;
        }

        public Criteria andWyfIsNotNull() {
            addCriterion("wyf is not null");
            return (Criteria) this;
        }

        public Criteria andWyfEqualTo(BigDecimal value) {
            addCriterion("wyf =", value, "wyf");
            return (Criteria) this;
        }

        public Criteria andWyfNotEqualTo(BigDecimal value) {
            addCriterion("wyf <>", value, "wyf");
            return (Criteria) this;
        }

        public Criteria andWyfGreaterThan(BigDecimal value) {
            addCriterion("wyf >", value, "wyf");
            return (Criteria) this;
        }

        public Criteria andWyfGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("wyf >=", value, "wyf");
            return (Criteria) this;
        }

        public Criteria andWyfLessThan(BigDecimal value) {
            addCriterion("wyf <", value, "wyf");
            return (Criteria) this;
        }

        public Criteria andWyfLessThanOrEqualTo(BigDecimal value) {
            addCriterion("wyf <=", value, "wyf");
            return (Criteria) this;
        }

        public Criteria andWyfIn(List<BigDecimal> values) {
            addCriterion("wyf in", values, "wyf");
            return (Criteria) this;
        }

        public Criteria andWyfNotIn(List<BigDecimal> values) {
            addCriterion("wyf not in", values, "wyf");
            return (Criteria) this;
        }

        public Criteria andWyfBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("wyf between", value1, value2, "wyf");
            return (Criteria) this;
        }

        public Criteria andWyfNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("wyf not between", value1, value2, "wyf");
            return (Criteria) this;
        }

        public Criteria andFwjglxIsNull() {
            addCriterion("fwjglx is null");
            return (Criteria) this;
        }

        public Criteria andFwjglxIsNotNull() {
            addCriterion("fwjglx is not null");
            return (Criteria) this;
        }

        public Criteria andFwjglxEqualTo(String value) {
            addCriterion("fwjglx =", value, "fwjglx");
            return (Criteria) this;
        }

        public Criteria andFwjglxNotEqualTo(String value) {
            addCriterion("fwjglx <>", value, "fwjglx");
            return (Criteria) this;
        }

        public Criteria andFwjglxGreaterThan(String value) {
            addCriterion("fwjglx >", value, "fwjglx");
            return (Criteria) this;
        }

        public Criteria andFwjglxGreaterThanOrEqualTo(String value) {
            addCriterion("fwjglx >=", value, "fwjglx");
            return (Criteria) this;
        }

        public Criteria andFwjglxLessThan(String value) {
            addCriterion("fwjglx <", value, "fwjglx");
            return (Criteria) this;
        }

        public Criteria andFwjglxLessThanOrEqualTo(String value) {
            addCriterion("fwjglx <=", value, "fwjglx");
            return (Criteria) this;
        }

        public Criteria andFwjglxLike(String value) {
            addCriterion("fwjglx like", value, "fwjglx");
            return (Criteria) this;
        }

        public Criteria andFwjglxNotLike(String value) {
            addCriterion("fwjglx not like", value, "fwjglx");
            return (Criteria) this;
        }

        public Criteria andFwjglxIn(List<String> values) {
            addCriterion("fwjglx in", values, "fwjglx");
            return (Criteria) this;
        }

        public Criteria andFwjglxNotIn(List<String> values) {
            addCriterion("fwjglx not in", values, "fwjglx");
            return (Criteria) this;
        }

        public Criteria andFwjglxBetween(String value1, String value2) {
            addCriterion("fwjglx between", value1, value2, "fwjglx");
            return (Criteria) this;
        }

        public Criteria andFwjglxNotBetween(String value1, String value2) {
            addCriterion("fwjglx not between", value1, value2, "fwjglx");
            return (Criteria) this;
        }

        public Criteria andWyfylxIsNull() {
            addCriterion("wyfylx is null");
            return (Criteria) this;
        }

        public Criteria andWyfylxIsNotNull() {
            addCriterion("wyfylx is not null");
            return (Criteria) this;
        }

        public Criteria andWyfylxEqualTo(String value) {
            addCriterion("wyfylx =", value, "wyfylx");
            return (Criteria) this;
        }

        public Criteria andWyfylxNotEqualTo(String value) {
            addCriterion("wyfylx <>", value, "wyfylx");
            return (Criteria) this;
        }

        public Criteria andWyfylxGreaterThan(String value) {
            addCriterion("wyfylx >", value, "wyfylx");
            return (Criteria) this;
        }

        public Criteria andWyfylxGreaterThanOrEqualTo(String value) {
            addCriterion("wyfylx >=", value, "wyfylx");
            return (Criteria) this;
        }

        public Criteria andWyfylxLessThan(String value) {
            addCriterion("wyfylx <", value, "wyfylx");
            return (Criteria) this;
        }

        public Criteria andWyfylxLessThanOrEqualTo(String value) {
            addCriterion("wyfylx <=", value, "wyfylx");
            return (Criteria) this;
        }

        public Criteria andWyfylxLike(String value) {
            addCriterion("wyfylx like", value, "wyfylx");
            return (Criteria) this;
        }

        public Criteria andWyfylxNotLike(String value) {
            addCriterion("wyfylx not like", value, "wyfylx");
            return (Criteria) this;
        }

        public Criteria andWyfylxIn(List<String> values) {
            addCriterion("wyfylx in", values, "wyfylx");
            return (Criteria) this;
        }

        public Criteria andWyfylxNotIn(List<String> values) {
            addCriterion("wyfylx not in", values, "wyfylx");
            return (Criteria) this;
        }

        public Criteria andWyfylxBetween(String value1, String value2) {
            addCriterion("wyfylx between", value1, value2, "wyfylx");
            return (Criteria) this;
        }

        public Criteria andWyfylxNotBetween(String value1, String value2) {
            addCriterion("wyfylx not between", value1, value2, "wyfylx");
            return (Criteria) this;
        }

        public Criteria andGfyhlxIsNull() {
            addCriterion("gfyhlx is null");
            return (Criteria) this;
        }

        public Criteria andGfyhlxIsNotNull() {
            addCriterion("gfyhlx is not null");
            return (Criteria) this;
        }

        public Criteria andGfyhlxEqualTo(String value) {
            addCriterion("gfyhlx =", value, "gfyhlx");
            return (Criteria) this;
        }

        public Criteria andGfyhlxNotEqualTo(String value) {
            addCriterion("gfyhlx <>", value, "gfyhlx");
            return (Criteria) this;
        }

        public Criteria andGfyhlxGreaterThan(String value) {
            addCriterion("gfyhlx >", value, "gfyhlx");
            return (Criteria) this;
        }

        public Criteria andGfyhlxGreaterThanOrEqualTo(String value) {
            addCriterion("gfyhlx >=", value, "gfyhlx");
            return (Criteria) this;
        }

        public Criteria andGfyhlxLessThan(String value) {
            addCriterion("gfyhlx <", value, "gfyhlx");
            return (Criteria) this;
        }

        public Criteria andGfyhlxLessThanOrEqualTo(String value) {
            addCriterion("gfyhlx <=", value, "gfyhlx");
            return (Criteria) this;
        }

        public Criteria andGfyhlxLike(String value) {
            addCriterion("gfyhlx like", value, "gfyhlx");
            return (Criteria) this;
        }

        public Criteria andGfyhlxNotLike(String value) {
            addCriterion("gfyhlx not like", value, "gfyhlx");
            return (Criteria) this;
        }

        public Criteria andGfyhlxIn(List<String> values) {
            addCriterion("gfyhlx in", values, "gfyhlx");
            return (Criteria) this;
        }

        public Criteria andGfyhlxNotIn(List<String> values) {
            addCriterion("gfyhlx not in", values, "gfyhlx");
            return (Criteria) this;
        }

        public Criteria andGfyhlxBetween(String value1, String value2) {
            addCriterion("gfyhlx between", value1, value2, "gfyhlx");
            return (Criteria) this;
        }

        public Criteria andGfyhlxNotBetween(String value1, String value2) {
            addCriterion("gfyhlx not between", value1, value2, "gfyhlx");
            return (Criteria) this;
        }

        public Criteria andPictimeIsNull() {
            addCriterion("pictime is null");
            return (Criteria) this;
        }

        public Criteria andPictimeIsNotNull() {
            addCriterion("pictime is not null");
            return (Criteria) this;
        }

        public Criteria andPictimeEqualTo(Date value) {
            addCriterion("pictime =", value, "pictime");
            return (Criteria) this;
        }

        public Criteria andPictimeNotEqualTo(Date value) {
            addCriterion("pictime <>", value, "pictime");
            return (Criteria) this;
        }

        public Criteria andPictimeGreaterThan(Date value) {
            addCriterion("pictime >", value, "pictime");
            return (Criteria) this;
        }

        public Criteria andPictimeGreaterThanOrEqualTo(Date value) {
            addCriterion("pictime >=", value, "pictime");
            return (Criteria) this;
        }

        public Criteria andPictimeLessThan(Date value) {
            addCriterion("pictime <", value, "pictime");
            return (Criteria) this;
        }

        public Criteria andPictimeLessThanOrEqualTo(Date value) {
            addCriterion("pictime <=", value, "pictime");
            return (Criteria) this;
        }

        public Criteria andPictimeIn(List<Date> values) {
            addCriterion("pictime in", values, "pictime");
            return (Criteria) this;
        }

        public Criteria andPictimeNotIn(List<Date> values) {
            addCriterion("pictime not in", values, "pictime");
            return (Criteria) this;
        }

        public Criteria andPictimeBetween(Date value1, Date value2) {
            addCriterion("pictime between", value1, value2, "pictime");
            return (Criteria) this;
        }

        public Criteria andPictimeNotBetween(Date value1, Date value2) {
            addCriterion("pictime not between", value1, value2, "pictime");
            return (Criteria) this;
        }

        public Criteria andHouseJgrqIsNull() {
            addCriterion("house_jgrq is null");
            return (Criteria) this;
        }

        public Criteria andHouseJgrqIsNotNull() {
            addCriterion("house_jgrq is not null");
            return (Criteria) this;
        }

        public Criteria andHouseJgrqEqualTo(Date value) {
            addCriterion("house_jgrq =", value, "houseJgrq");
            return (Criteria) this;
        }

        public Criteria andHouseJgrqNotEqualTo(Date value) {
            addCriterion("house_jgrq <>", value, "houseJgrq");
            return (Criteria) this;
        }

        public Criteria andHouseJgrqGreaterThan(Date value) {
            addCriterion("house_jgrq >", value, "houseJgrq");
            return (Criteria) this;
        }

        public Criteria andHouseJgrqGreaterThanOrEqualTo(Date value) {
            addCriterion("house_jgrq >=", value, "houseJgrq");
            return (Criteria) this;
        }

        public Criteria andHouseJgrqLessThan(Date value) {
            addCriterion("house_jgrq <", value, "houseJgrq");
            return (Criteria) this;
        }

        public Criteria andHouseJgrqLessThanOrEqualTo(Date value) {
            addCriterion("house_jgrq <=", value, "houseJgrq");
            return (Criteria) this;
        }

        public Criteria andHouseJgrqIn(List<Date> values) {
            addCriterion("house_jgrq in", values, "houseJgrq");
            return (Criteria) this;
        }

        public Criteria andHouseJgrqNotIn(List<Date> values) {
            addCriterion("house_jgrq not in", values, "houseJgrq");
            return (Criteria) this;
        }

        public Criteria andHouseJgrqBetween(Date value1, Date value2) {
            addCriterion("house_jgrq between", value1, value2, "houseJgrq");
            return (Criteria) this;
        }

        public Criteria andHouseJgrqNotBetween(Date value1, Date value2) {
            addCriterion("house_jgrq not between", value1, value2, "houseJgrq");
            return (Criteria) this;
        }

        public Criteria andHouseJgdjIsNull() {
            addCriterion("house_jgdj is null");
            return (Criteria) this;
        }

        public Criteria andHouseJgdjIsNotNull() {
            addCriterion("house_jgdj is not null");
            return (Criteria) this;
        }

        public Criteria andHouseJgdjEqualTo(String value) {
            addCriterion("house_jgdj =", value, "houseJgdj");
            return (Criteria) this;
        }

        public Criteria andHouseJgdjNotEqualTo(String value) {
            addCriterion("house_jgdj <>", value, "houseJgdj");
            return (Criteria) this;
        }

        public Criteria andHouseJgdjGreaterThan(String value) {
            addCriterion("house_jgdj >", value, "houseJgdj");
            return (Criteria) this;
        }

        public Criteria andHouseJgdjGreaterThanOrEqualTo(String value) {
            addCriterion("house_jgdj >=", value, "houseJgdj");
            return (Criteria) this;
        }

        public Criteria andHouseJgdjLessThan(String value) {
            addCriterion("house_jgdj <", value, "houseJgdj");
            return (Criteria) this;
        }

        public Criteria andHouseJgdjLessThanOrEqualTo(String value) {
            addCriterion("house_jgdj <=", value, "houseJgdj");
            return (Criteria) this;
        }

        public Criteria andHouseJgdjLike(String value) {
            addCriterion("house_jgdj like", value, "houseJgdj");
            return (Criteria) this;
        }

        public Criteria andHouseJgdjNotLike(String value) {
            addCriterion("house_jgdj not like", value, "houseJgdj");
            return (Criteria) this;
        }

        public Criteria andHouseJgdjIn(List<String> values) {
            addCriterion("house_jgdj in", values, "houseJgdj");
            return (Criteria) this;
        }

        public Criteria andHouseJgdjNotIn(List<String> values) {
            addCriterion("house_jgdj not in", values, "houseJgdj");
            return (Criteria) this;
        }

        public Criteria andHouseJgdjBetween(String value1, String value2) {
            addCriterion("house_jgdj between", value1, value2, "houseJgdj");
            return (Criteria) this;
        }

        public Criteria andHouseJgdjNotBetween(String value1, String value2) {
            addCriterion("house_jgdj not between", value1, value2, "houseJgdj");
            return (Criteria) this;
        }

        public Criteria andHouseYtmjIsNull() {
            addCriterion("house_ytmj is null");
            return (Criteria) this;
        }

        public Criteria andHouseYtmjIsNotNull() {
            addCriterion("house_ytmj is not null");
            return (Criteria) this;
        }

        public Criteria andHouseYtmjEqualTo(BigDecimal value) {
            addCriterion("house_ytmj =", value, "houseYtmj");
            return (Criteria) this;
        }

        public Criteria andHouseYtmjNotEqualTo(BigDecimal value) {
            addCriterion("house_ytmj <>", value, "houseYtmj");
            return (Criteria) this;
        }

        public Criteria andHouseYtmjGreaterThan(BigDecimal value) {
            addCriterion("house_ytmj >", value, "houseYtmj");
            return (Criteria) this;
        }

        public Criteria andHouseYtmjGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("house_ytmj >=", value, "houseYtmj");
            return (Criteria) this;
        }

        public Criteria andHouseYtmjLessThan(BigDecimal value) {
            addCriterion("house_ytmj <", value, "houseYtmj");
            return (Criteria) this;
        }

        public Criteria andHouseYtmjLessThanOrEqualTo(BigDecimal value) {
            addCriterion("house_ytmj <=", value, "houseYtmj");
            return (Criteria) this;
        }

        public Criteria andHouseYtmjIn(List<BigDecimal> values) {
            addCriterion("house_ytmj in", values, "houseYtmj");
            return (Criteria) this;
        }

        public Criteria andHouseYtmjNotIn(List<BigDecimal> values) {
            addCriterion("house_ytmj not in", values, "houseYtmj");
            return (Criteria) this;
        }

        public Criteria andHouseYtmjBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("house_ytmj between", value1, value2, "houseYtmj");
            return (Criteria) this;
        }

        public Criteria andHouseYtmjNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("house_ytmj not between", value1, value2, "houseYtmj");
            return (Criteria) this;
        }

        public Criteria andHouseFwlbIsNull() {
            addCriterion("house_fwlb is null");
            return (Criteria) this;
        }

        public Criteria andHouseFwlbIsNotNull() {
            addCriterion("house_fwlb is not null");
            return (Criteria) this;
        }

        public Criteria andHouseFwlbEqualTo(String value) {
            addCriterion("house_fwlb =", value, "houseFwlb");
            return (Criteria) this;
        }

        public Criteria andHouseFwlbNotEqualTo(String value) {
            addCriterion("house_fwlb <>", value, "houseFwlb");
            return (Criteria) this;
        }

        public Criteria andHouseFwlbGreaterThan(String value) {
            addCriterion("house_fwlb >", value, "houseFwlb");
            return (Criteria) this;
        }

        public Criteria andHouseFwlbGreaterThanOrEqualTo(String value) {
            addCriterion("house_fwlb >=", value, "houseFwlb");
            return (Criteria) this;
        }

        public Criteria andHouseFwlbLessThan(String value) {
            addCriterion("house_fwlb <", value, "houseFwlb");
            return (Criteria) this;
        }

        public Criteria andHouseFwlbLessThanOrEqualTo(String value) {
            addCriterion("house_fwlb <=", value, "houseFwlb");
            return (Criteria) this;
        }

        public Criteria andHouseFwlbLike(String value) {
            addCriterion("house_fwlb like", value, "houseFwlb");
            return (Criteria) this;
        }

        public Criteria andHouseFwlbNotLike(String value) {
            addCriterion("house_fwlb not like", value, "houseFwlb");
            return (Criteria) this;
        }

        public Criteria andHouseFwlbIn(List<String> values) {
            addCriterion("house_fwlb in", values, "houseFwlb");
            return (Criteria) this;
        }

        public Criteria andHouseFwlbNotIn(List<String> values) {
            addCriterion("house_fwlb not in", values, "houseFwlb");
            return (Criteria) this;
        }

        public Criteria andHouseFwlbBetween(String value1, String value2) {
            addCriterion("house_fwlb between", value1, value2, "houseFwlb");
            return (Criteria) this;
        }

        public Criteria andHouseFwlbNotBetween(String value1, String value2) {
            addCriterion("house_fwlb not between", value1, value2, "houseFwlb");
            return (Criteria) this;
        }

        public Criteria andHouseDmmjIsNull() {
            addCriterion("house_dmmj is null");
            return (Criteria) this;
        }

        public Criteria andHouseDmmjIsNotNull() {
            addCriterion("house_dmmj is not null");
            return (Criteria) this;
        }

        public Criteria andHouseDmmjEqualTo(BigDecimal value) {
            addCriterion("house_dmmj =", value, "houseDmmj");
            return (Criteria) this;
        }

        public Criteria andHouseDmmjNotEqualTo(BigDecimal value) {
            addCriterion("house_dmmj <>", value, "houseDmmj");
            return (Criteria) this;
        }

        public Criteria andHouseDmmjGreaterThan(BigDecimal value) {
            addCriterion("house_dmmj >", value, "houseDmmj");
            return (Criteria) this;
        }

        public Criteria andHouseDmmjGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("house_dmmj >=", value, "houseDmmj");
            return (Criteria) this;
        }

        public Criteria andHouseDmmjLessThan(BigDecimal value) {
            addCriterion("house_dmmj <", value, "houseDmmj");
            return (Criteria) this;
        }

        public Criteria andHouseDmmjLessThanOrEqualTo(BigDecimal value) {
            addCriterion("house_dmmj <=", value, "houseDmmj");
            return (Criteria) this;
        }

        public Criteria andHouseDmmjIn(List<BigDecimal> values) {
            addCriterion("house_dmmj in", values, "houseDmmj");
            return (Criteria) this;
        }

        public Criteria andHouseDmmjNotIn(List<BigDecimal> values) {
            addCriterion("house_dmmj not in", values, "houseDmmj");
            return (Criteria) this;
        }

        public Criteria andHouseDmmjBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("house_dmmj between", value1, value2, "houseDmmj");
            return (Criteria) this;
        }

        public Criteria andHouseDmmjNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("house_dmmj not between", value1, value2, "houseDmmj");
            return (Criteria) this;
        }

        public Criteria andHouseJgqxIsNull() {
            addCriterion("house_jgqx is null");
            return (Criteria) this;
        }

        public Criteria andHouseJgqxIsNotNull() {
            addCriterion("house_jgqx is not null");
            return (Criteria) this;
        }

        public Criteria andHouseJgqxEqualTo(BigDecimal value) {
            addCriterion("house_jgqx =", value, "houseJgqx");
            return (Criteria) this;
        }

        public Criteria andHouseJgqxNotEqualTo(BigDecimal value) {
            addCriterion("house_jgqx <>", value, "houseJgqx");
            return (Criteria) this;
        }

        public Criteria andHouseJgqxGreaterThan(BigDecimal value) {
            addCriterion("house_jgqx >", value, "houseJgqx");
            return (Criteria) this;
        }

        public Criteria andHouseJgqxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("house_jgqx >=", value, "houseJgqx");
            return (Criteria) this;
        }

        public Criteria andHouseJgqxLessThan(BigDecimal value) {
            addCriterion("house_jgqx <", value, "houseJgqx");
            return (Criteria) this;
        }

        public Criteria andHouseJgqxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("house_jgqx <=", value, "houseJgqx");
            return (Criteria) this;
        }

        public Criteria andHouseJgqxIn(List<BigDecimal> values) {
            addCriterion("house_jgqx in", values, "houseJgqx");
            return (Criteria) this;
        }

        public Criteria andHouseJgqxNotIn(List<BigDecimal> values) {
            addCriterion("house_jgqx not in", values, "houseJgqx");
            return (Criteria) this;
        }

        public Criteria andHouseJgqxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("house_jgqx between", value1, value2, "houseJgqx");
            return (Criteria) this;
        }

        public Criteria andHouseJgqxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("house_jgqx not between", value1, value2, "houseJgqx");
            return (Criteria) this;
        }

        public Criteria andHouseHjxsIsNull() {
            addCriterion("house_hjxs is null");
            return (Criteria) this;
        }

        public Criteria andHouseHjxsIsNotNull() {
            addCriterion("house_hjxs is not null");
            return (Criteria) this;
        }

        public Criteria andHouseHjxsEqualTo(BigDecimal value) {
            addCriterion("house_hjxs =", value, "houseHjxs");
            return (Criteria) this;
        }

        public Criteria andHouseHjxsNotEqualTo(BigDecimal value) {
            addCriterion("house_hjxs <>", value, "houseHjxs");
            return (Criteria) this;
        }

        public Criteria andHouseHjxsGreaterThan(BigDecimal value) {
            addCriterion("house_hjxs >", value, "houseHjxs");
            return (Criteria) this;
        }

        public Criteria andHouseHjxsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("house_hjxs >=", value, "houseHjxs");
            return (Criteria) this;
        }

        public Criteria andHouseHjxsLessThan(BigDecimal value) {
            addCriterion("house_hjxs <", value, "houseHjxs");
            return (Criteria) this;
        }

        public Criteria andHouseHjxsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("house_hjxs <=", value, "houseHjxs");
            return (Criteria) this;
        }

        public Criteria andHouseHjxsIn(List<BigDecimal> values) {
            addCriterion("house_hjxs in", values, "houseHjxs");
            return (Criteria) this;
        }

        public Criteria andHouseHjxsNotIn(List<BigDecimal> values) {
            addCriterion("house_hjxs not in", values, "houseHjxs");
            return (Criteria) this;
        }

        public Criteria andHouseHjxsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("house_hjxs between", value1, value2, "houseHjxs");
            return (Criteria) this;
        }

        public Criteria andHouseHjxsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("house_hjxs not between", value1, value2, "houseHjxs");
            return (Criteria) this;
        }

        public Criteria andHouseGnxsIsNull() {
            addCriterion("house_gnxs is null");
            return (Criteria) this;
        }

        public Criteria andHouseGnxsIsNotNull() {
            addCriterion("house_gnxs is not null");
            return (Criteria) this;
        }

        public Criteria andHouseGnxsEqualTo(BigDecimal value) {
            addCriterion("house_gnxs =", value, "houseGnxs");
            return (Criteria) this;
        }

        public Criteria andHouseGnxsNotEqualTo(BigDecimal value) {
            addCriterion("house_gnxs <>", value, "houseGnxs");
            return (Criteria) this;
        }

        public Criteria andHouseGnxsGreaterThan(BigDecimal value) {
            addCriterion("house_gnxs >", value, "houseGnxs");
            return (Criteria) this;
        }

        public Criteria andHouseGnxsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("house_gnxs >=", value, "houseGnxs");
            return (Criteria) this;
        }

        public Criteria andHouseGnxsLessThan(BigDecimal value) {
            addCriterion("house_gnxs <", value, "houseGnxs");
            return (Criteria) this;
        }

        public Criteria andHouseGnxsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("house_gnxs <=", value, "houseGnxs");
            return (Criteria) this;
        }

        public Criteria andHouseGnxsIn(List<BigDecimal> values) {
            addCriterion("house_gnxs in", values, "houseGnxs");
            return (Criteria) this;
        }

        public Criteria andHouseGnxsNotIn(List<BigDecimal> values) {
            addCriterion("house_gnxs not in", values, "houseGnxs");
            return (Criteria) this;
        }

        public Criteria andHouseGnxsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("house_gnxs between", value1, value2, "houseGnxs");
            return (Criteria) this;
        }

        public Criteria andHouseGnxsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("house_gnxs not between", value1, value2, "houseGnxs");
            return (Criteria) this;
        }

        public Criteria andHouseFjfIsNull() {
            addCriterion("house_fjf is null");
            return (Criteria) this;
        }

        public Criteria andHouseFjfIsNotNull() {
            addCriterion("house_fjf is not null");
            return (Criteria) this;
        }

        public Criteria andHouseFjfEqualTo(BigDecimal value) {
            addCriterion("house_fjf =", value, "houseFjf");
            return (Criteria) this;
        }

        public Criteria andHouseFjfNotEqualTo(BigDecimal value) {
            addCriterion("house_fjf <>", value, "houseFjf");
            return (Criteria) this;
        }

        public Criteria andHouseFjfGreaterThan(BigDecimal value) {
            addCriterion("house_fjf >", value, "houseFjf");
            return (Criteria) this;
        }

        public Criteria andHouseFjfGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("house_fjf >=", value, "houseFjf");
            return (Criteria) this;
        }

        public Criteria andHouseFjfLessThan(BigDecimal value) {
            addCriterion("house_fjf <", value, "houseFjf");
            return (Criteria) this;
        }

        public Criteria andHouseFjfLessThanOrEqualTo(BigDecimal value) {
            addCriterion("house_fjf <=", value, "houseFjf");
            return (Criteria) this;
        }

        public Criteria andHouseFjfIn(List<BigDecimal> values) {
            addCriterion("house_fjf in", values, "houseFjf");
            return (Criteria) this;
        }

        public Criteria andHouseFjfNotIn(List<BigDecimal> values) {
            addCriterion("house_fjf not in", values, "houseFjf");
            return (Criteria) this;
        }

        public Criteria andHouseFjfBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("house_fjf between", value1, value2, "houseFjf");
            return (Criteria) this;
        }

        public Criteria andHouseFjfNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("house_fjf not between", value1, value2, "houseFjf");
            return (Criteria) this;
        }

        public Criteria andHouseFkytIsNull() {
            addCriterion("house_fkyt is null");
            return (Criteria) this;
        }

        public Criteria andHouseFkytIsNotNull() {
            addCriterion("house_fkyt is not null");
            return (Criteria) this;
        }

        public Criteria andHouseFkytEqualTo(String value) {
            addCriterion("house_fkyt =", value, "houseFkyt");
            return (Criteria) this;
        }

        public Criteria andHouseFkytNotEqualTo(String value) {
            addCriterion("house_fkyt <>", value, "houseFkyt");
            return (Criteria) this;
        }

        public Criteria andHouseFkytGreaterThan(String value) {
            addCriterion("house_fkyt >", value, "houseFkyt");
            return (Criteria) this;
        }

        public Criteria andHouseFkytGreaterThanOrEqualTo(String value) {
            addCriterion("house_fkyt >=", value, "houseFkyt");
            return (Criteria) this;
        }

        public Criteria andHouseFkytLessThan(String value) {
            addCriterion("house_fkyt <", value, "houseFkyt");
            return (Criteria) this;
        }

        public Criteria andHouseFkytLessThanOrEqualTo(String value) {
            addCriterion("house_fkyt <=", value, "houseFkyt");
            return (Criteria) this;
        }

        public Criteria andHouseFkytLike(String value) {
            addCriterion("house_fkyt like", value, "houseFkyt");
            return (Criteria) this;
        }

        public Criteria andHouseFkytNotLike(String value) {
            addCriterion("house_fkyt not like", value, "houseFkyt");
            return (Criteria) this;
        }

        public Criteria andHouseFkytIn(List<String> values) {
            addCriterion("house_fkyt in", values, "houseFkyt");
            return (Criteria) this;
        }

        public Criteria andHouseFkytNotIn(List<String> values) {
            addCriterion("house_fkyt not in", values, "houseFkyt");
            return (Criteria) this;
        }

        public Criteria andHouseFkytBetween(String value1, String value2) {
            addCriterion("house_fkyt between", value1, value2, "houseFkyt");
            return (Criteria) this;
        }

        public Criteria andHouseFkytNotBetween(String value1, String value2) {
            addCriterion("house_fkyt not between", value1, value2, "houseFkyt");
            return (Criteria) this;
        }

        public Criteria andHouseXyzfIsNull() {
            addCriterion("house_xyzf is null");
            return (Criteria) this;
        }

        public Criteria andHouseXyzfIsNotNull() {
            addCriterion("house_xyzf is not null");
            return (Criteria) this;
        }

        public Criteria andHouseXyzfEqualTo(String value) {
            addCriterion("house_xyzf =", value, "houseXyzf");
            return (Criteria) this;
        }

        public Criteria andHouseXyzfNotEqualTo(String value) {
            addCriterion("house_xyzf <>", value, "houseXyzf");
            return (Criteria) this;
        }

        public Criteria andHouseXyzfGreaterThan(String value) {
            addCriterion("house_xyzf >", value, "houseXyzf");
            return (Criteria) this;
        }

        public Criteria andHouseXyzfGreaterThanOrEqualTo(String value) {
            addCriterion("house_xyzf >=", value, "houseXyzf");
            return (Criteria) this;
        }

        public Criteria andHouseXyzfLessThan(String value) {
            addCriterion("house_xyzf <", value, "houseXyzf");
            return (Criteria) this;
        }

        public Criteria andHouseXyzfLessThanOrEqualTo(String value) {
            addCriterion("house_xyzf <=", value, "houseXyzf");
            return (Criteria) this;
        }

        public Criteria andHouseXyzfLike(String value) {
            addCriterion("house_xyzf like", value, "houseXyzf");
            return (Criteria) this;
        }

        public Criteria andHouseXyzfNotLike(String value) {
            addCriterion("house_xyzf not like", value, "houseXyzf");
            return (Criteria) this;
        }

        public Criteria andHouseXyzfIn(List<String> values) {
            addCriterion("house_xyzf in", values, "houseXyzf");
            return (Criteria) this;
        }

        public Criteria andHouseXyzfNotIn(List<String> values) {
            addCriterion("house_xyzf not in", values, "houseXyzf");
            return (Criteria) this;
        }

        public Criteria andHouseXyzfBetween(String value1, String value2) {
            addCriterion("house_xyzf between", value1, value2, "houseXyzf");
            return (Criteria) this;
        }

        public Criteria andHouseXyzfNotBetween(String value1, String value2) {
            addCriterion("house_xyzf not between", value1, value2, "houseXyzf");
            return (Criteria) this;
        }

        public Criteria andHouseRareaIsNull() {
            addCriterion("house_rarea is null");
            return (Criteria) this;
        }

        public Criteria andHouseRareaIsNotNull() {
            addCriterion("house_rarea is not null");
            return (Criteria) this;
        }

        public Criteria andHouseRareaEqualTo(BigDecimal value) {
            addCriterion("house_rarea =", value, "houseRarea");
            return (Criteria) this;
        }

        public Criteria andHouseRareaNotEqualTo(BigDecimal value) {
            addCriterion("house_rarea <>", value, "houseRarea");
            return (Criteria) this;
        }

        public Criteria andHouseRareaGreaterThan(BigDecimal value) {
            addCriterion("house_rarea >", value, "houseRarea");
            return (Criteria) this;
        }

        public Criteria andHouseRareaGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("house_rarea >=", value, "houseRarea");
            return (Criteria) this;
        }

        public Criteria andHouseRareaLessThan(BigDecimal value) {
            addCriterion("house_rarea <", value, "houseRarea");
            return (Criteria) this;
        }

        public Criteria andHouseRareaLessThanOrEqualTo(BigDecimal value) {
            addCriterion("house_rarea <=", value, "houseRarea");
            return (Criteria) this;
        }

        public Criteria andHouseRareaIn(List<BigDecimal> values) {
            addCriterion("house_rarea in", values, "houseRarea");
            return (Criteria) this;
        }

        public Criteria andHouseRareaNotIn(List<BigDecimal> values) {
            addCriterion("house_rarea not in", values, "houseRarea");
            return (Criteria) this;
        }

        public Criteria andHouseRareaBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("house_rarea between", value1, value2, "houseRarea");
            return (Criteria) this;
        }

        public Criteria andHouseRareaNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("house_rarea not between", value1, value2, "houseRarea");
            return (Criteria) this;
        }

        public Criteria andHouseKindIsNull() {
            addCriterion("house_kind is null");
            return (Criteria) this;
        }

        public Criteria andHouseKindIsNotNull() {
            addCriterion("house_kind is not null");
            return (Criteria) this;
        }

        public Criteria andHouseKindEqualTo(String value) {
            addCriterion("house_kind =", value, "houseKind");
            return (Criteria) this;
        }

        public Criteria andHouseKindNotEqualTo(String value) {
            addCriterion("house_kind <>", value, "houseKind");
            return (Criteria) this;
        }

        public Criteria andHouseKindGreaterThan(String value) {
            addCriterion("house_kind >", value, "houseKind");
            return (Criteria) this;
        }

        public Criteria andHouseKindGreaterThanOrEqualTo(String value) {
            addCriterion("house_kind >=", value, "houseKind");
            return (Criteria) this;
        }

        public Criteria andHouseKindLessThan(String value) {
            addCriterion("house_kind <", value, "houseKind");
            return (Criteria) this;
        }

        public Criteria andHouseKindLessThanOrEqualTo(String value) {
            addCriterion("house_kind <=", value, "houseKind");
            return (Criteria) this;
        }

        public Criteria andHouseKindLike(String value) {
            addCriterion("house_kind like", value, "houseKind");
            return (Criteria) this;
        }

        public Criteria andHouseKindNotLike(String value) {
            addCriterion("house_kind not like", value, "houseKind");
            return (Criteria) this;
        }

        public Criteria andHouseKindIn(List<String> values) {
            addCriterion("house_kind in", values, "houseKind");
            return (Criteria) this;
        }

        public Criteria andHouseKindNotIn(List<String> values) {
            addCriterion("house_kind not in", values, "houseKind");
            return (Criteria) this;
        }

        public Criteria andHouseKindBetween(String value1, String value2) {
            addCriterion("house_kind between", value1, value2, "houseKind");
            return (Criteria) this;
        }

        public Criteria andHouseKindNotBetween(String value1, String value2) {
            addCriterion("house_kind not between", value1, value2, "houseKind");
            return (Criteria) this;
        }

        public Criteria andHouseSbIsNull() {
            addCriterion("house_sb is null");
            return (Criteria) this;
        }

        public Criteria andHouseSbIsNotNull() {
            addCriterion("house_sb is not null");
            return (Criteria) this;
        }

        public Criteria andHouseSbEqualTo(String value) {
            addCriterion("house_sb =", value, "houseSb");
            return (Criteria) this;
        }

        public Criteria andHouseSbNotEqualTo(String value) {
            addCriterion("house_sb <>", value, "houseSb");
            return (Criteria) this;
        }

        public Criteria andHouseSbGreaterThan(String value) {
            addCriterion("house_sb >", value, "houseSb");
            return (Criteria) this;
        }

        public Criteria andHouseSbGreaterThanOrEqualTo(String value) {
            addCriterion("house_sb >=", value, "houseSb");
            return (Criteria) this;
        }

        public Criteria andHouseSbLessThan(String value) {
            addCriterion("house_sb <", value, "houseSb");
            return (Criteria) this;
        }

        public Criteria andHouseSbLessThanOrEqualTo(String value) {
            addCriterion("house_sb <=", value, "houseSb");
            return (Criteria) this;
        }

        public Criteria andHouseSbLike(String value) {
            addCriterion("house_sb like", value, "houseSb");
            return (Criteria) this;
        }

        public Criteria andHouseSbNotLike(String value) {
            addCriterion("house_sb not like", value, "houseSb");
            return (Criteria) this;
        }

        public Criteria andHouseSbIn(List<String> values) {
            addCriterion("house_sb in", values, "houseSb");
            return (Criteria) this;
        }

        public Criteria andHouseSbNotIn(List<String> values) {
            addCriterion("house_sb not in", values, "houseSb");
            return (Criteria) this;
        }

        public Criteria andHouseSbBetween(String value1, String value2) {
            addCriterion("house_sb between", value1, value2, "houseSb");
            return (Criteria) this;
        }

        public Criteria andHouseSbNotBetween(String value1, String value2) {
            addCriterion("house_sb not between", value1, value2, "houseSb");
            return (Criteria) this;
        }

        public Criteria andHouseSeserialIsNull() {
            addCriterion("house_seserial is null");
            return (Criteria) this;
        }

        public Criteria andHouseSeserialIsNotNull() {
            addCriterion("house_seserial is not null");
            return (Criteria) this;
        }

        public Criteria andHouseSeserialEqualTo(String value) {
            addCriterion("house_seserial =", value, "houseSeserial");
            return (Criteria) this;
        }

        public Criteria andHouseSeserialNotEqualTo(String value) {
            addCriterion("house_seserial <>", value, "houseSeserial");
            return (Criteria) this;
        }

        public Criteria andHouseSeserialGreaterThan(String value) {
            addCriterion("house_seserial >", value, "houseSeserial");
            return (Criteria) this;
        }

        public Criteria andHouseSeserialGreaterThanOrEqualTo(String value) {
            addCriterion("house_seserial >=", value, "houseSeserial");
            return (Criteria) this;
        }

        public Criteria andHouseSeserialLessThan(String value) {
            addCriterion("house_seserial <", value, "houseSeserial");
            return (Criteria) this;
        }

        public Criteria andHouseSeserialLessThanOrEqualTo(String value) {
            addCriterion("house_seserial <=", value, "houseSeserial");
            return (Criteria) this;
        }

        public Criteria andHouseSeserialLike(String value) {
            addCriterion("house_seserial like", value, "houseSeserial");
            return (Criteria) this;
        }

        public Criteria andHouseSeserialNotLike(String value) {
            addCriterion("house_seserial not like", value, "houseSeserial");
            return (Criteria) this;
        }

        public Criteria andHouseSeserialIn(List<String> values) {
            addCriterion("house_seserial in", values, "houseSeserial");
            return (Criteria) this;
        }

        public Criteria andHouseSeserialNotIn(List<String> values) {
            addCriterion("house_seserial not in", values, "houseSeserial");
            return (Criteria) this;
        }

        public Criteria andHouseSeserialBetween(String value1, String value2) {
            addCriterion("house_seserial between", value1, value2, "houseSeserial");
            return (Criteria) this;
        }

        public Criteria andHouseSeserialNotBetween(String value1, String value2) {
            addCriterion("house_seserial not between", value1, value2, "houseSeserial");
            return (Criteria) this;
        }

        public Criteria andHouseAIsNull() {
            addCriterion("house_a is null");
            return (Criteria) this;
        }

        public Criteria andHouseAIsNotNull() {
            addCriterion("house_a is not null");
            return (Criteria) this;
        }

        public Criteria andHouseAEqualTo(String value) {
            addCriterion("house_a =", value, "houseA");
            return (Criteria) this;
        }

        public Criteria andHouseANotEqualTo(String value) {
            addCriterion("house_a <>", value, "houseA");
            return (Criteria) this;
        }

        public Criteria andHouseAGreaterThan(String value) {
            addCriterion("house_a >", value, "houseA");
            return (Criteria) this;
        }

        public Criteria andHouseAGreaterThanOrEqualTo(String value) {
            addCriterion("house_a >=", value, "houseA");
            return (Criteria) this;
        }

        public Criteria andHouseALessThan(String value) {
            addCriterion("house_a <", value, "houseA");
            return (Criteria) this;
        }

        public Criteria andHouseALessThanOrEqualTo(String value) {
            addCriterion("house_a <=", value, "houseA");
            return (Criteria) this;
        }

        public Criteria andHouseALike(String value) {
            addCriterion("house_a like", value, "houseA");
            return (Criteria) this;
        }

        public Criteria andHouseANotLike(String value) {
            addCriterion("house_a not like", value, "houseA");
            return (Criteria) this;
        }

        public Criteria andHouseAIn(List<String> values) {
            addCriterion("house_a in", values, "houseA");
            return (Criteria) this;
        }

        public Criteria andHouseANotIn(List<String> values) {
            addCriterion("house_a not in", values, "houseA");
            return (Criteria) this;
        }

        public Criteria andHouseABetween(String value1, String value2) {
            addCriterion("house_a between", value1, value2, "houseA");
            return (Criteria) this;
        }

        public Criteria andHouseANotBetween(String value1, String value2) {
            addCriterion("house_a not between", value1, value2, "houseA");
            return (Criteria) this;
        }

        public Criteria andHouseCrareaIsNull() {
            addCriterion("house_crarea is null");
            return (Criteria) this;
        }

        public Criteria andHouseCrareaIsNotNull() {
            addCriterion("house_crarea is not null");
            return (Criteria) this;
        }

        public Criteria andHouseCrareaEqualTo(BigDecimal value) {
            addCriterion("house_crarea =", value, "houseCrarea");
            return (Criteria) this;
        }

        public Criteria andHouseCrareaNotEqualTo(BigDecimal value) {
            addCriterion("house_crarea <>", value, "houseCrarea");
            return (Criteria) this;
        }

        public Criteria andHouseCrareaGreaterThan(BigDecimal value) {
            addCriterion("house_crarea >", value, "houseCrarea");
            return (Criteria) this;
        }

        public Criteria andHouseCrareaGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("house_crarea >=", value, "houseCrarea");
            return (Criteria) this;
        }

        public Criteria andHouseCrareaLessThan(BigDecimal value) {
            addCriterion("house_crarea <", value, "houseCrarea");
            return (Criteria) this;
        }

        public Criteria andHouseCrareaLessThanOrEqualTo(BigDecimal value) {
            addCriterion("house_crarea <=", value, "houseCrarea");
            return (Criteria) this;
        }

        public Criteria andHouseCrareaIn(List<BigDecimal> values) {
            addCriterion("house_crarea in", values, "houseCrarea");
            return (Criteria) this;
        }

        public Criteria andHouseCrareaNotIn(List<BigDecimal> values) {
            addCriterion("house_crarea not in", values, "houseCrarea");
            return (Criteria) this;
        }

        public Criteria andHouseCrareaBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("house_crarea between", value1, value2, "houseCrarea");
            return (Criteria) this;
        }

        public Criteria andHouseCrareaNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("house_crarea not between", value1, value2, "houseCrarea");
            return (Criteria) this;
        }

        public Criteria andHouseCbareaIsNull() {
            addCriterion("house_cbarea is null");
            return (Criteria) this;
        }

        public Criteria andHouseCbareaIsNotNull() {
            addCriterion("house_cbarea is not null");
            return (Criteria) this;
        }

        public Criteria andHouseCbareaEqualTo(BigDecimal value) {
            addCriterion("house_cbarea =", value, "houseCbarea");
            return (Criteria) this;
        }

        public Criteria andHouseCbareaNotEqualTo(BigDecimal value) {
            addCriterion("house_cbarea <>", value, "houseCbarea");
            return (Criteria) this;
        }

        public Criteria andHouseCbareaGreaterThan(BigDecimal value) {
            addCriterion("house_cbarea >", value, "houseCbarea");
            return (Criteria) this;
        }

        public Criteria andHouseCbareaGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("house_cbarea >=", value, "houseCbarea");
            return (Criteria) this;
        }

        public Criteria andHouseCbareaLessThan(BigDecimal value) {
            addCriterion("house_cbarea <", value, "houseCbarea");
            return (Criteria) this;
        }

        public Criteria andHouseCbareaLessThanOrEqualTo(BigDecimal value) {
            addCriterion("house_cbarea <=", value, "houseCbarea");
            return (Criteria) this;
        }

        public Criteria andHouseCbareaIn(List<BigDecimal> values) {
            addCriterion("house_cbarea in", values, "houseCbarea");
            return (Criteria) this;
        }

        public Criteria andHouseCbareaNotIn(List<BigDecimal> values) {
            addCriterion("house_cbarea not in", values, "houseCbarea");
            return (Criteria) this;
        }

        public Criteria andHouseCbareaBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("house_cbarea between", value1, value2, "houseCbarea");
            return (Criteria) this;
        }

        public Criteria andHouseCbareaNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("house_cbarea not between", value1, value2, "houseCbarea");
            return (Criteria) this;
        }

        public Criteria andHouseCuareaIsNull() {
            addCriterion("house_cuarea is null");
            return (Criteria) this;
        }

        public Criteria andHouseCuareaIsNotNull() {
            addCriterion("house_cuarea is not null");
            return (Criteria) this;
        }

        public Criteria andHouseCuareaEqualTo(BigDecimal value) {
            addCriterion("house_cuarea =", value, "houseCuarea");
            return (Criteria) this;
        }

        public Criteria andHouseCuareaNotEqualTo(BigDecimal value) {
            addCriterion("house_cuarea <>", value, "houseCuarea");
            return (Criteria) this;
        }

        public Criteria andHouseCuareaGreaterThan(BigDecimal value) {
            addCriterion("house_cuarea >", value, "houseCuarea");
            return (Criteria) this;
        }

        public Criteria andHouseCuareaGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("house_cuarea >=", value, "houseCuarea");
            return (Criteria) this;
        }

        public Criteria andHouseCuareaLessThan(BigDecimal value) {
            addCriterion("house_cuarea <", value, "houseCuarea");
            return (Criteria) this;
        }

        public Criteria andHouseCuareaLessThanOrEqualTo(BigDecimal value) {
            addCriterion("house_cuarea <=", value, "houseCuarea");
            return (Criteria) this;
        }

        public Criteria andHouseCuareaIn(List<BigDecimal> values) {
            addCriterion("house_cuarea in", values, "houseCuarea");
            return (Criteria) this;
        }

        public Criteria andHouseCuareaNotIn(List<BigDecimal> values) {
            addCriterion("house_cuarea not in", values, "houseCuarea");
            return (Criteria) this;
        }

        public Criteria andHouseCuareaBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("house_cuarea between", value1, value2, "houseCuarea");
            return (Criteria) this;
        }

        public Criteria andHouseCuareaNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("house_cuarea not between", value1, value2, "houseCuarea");
            return (Criteria) this;
        }

        public Criteria andHouseDtfyIsNull() {
            addCriterion("house_dtfy is null");
            return (Criteria) this;
        }

        public Criteria andHouseDtfyIsNotNull() {
            addCriterion("house_dtfy is not null");
            return (Criteria) this;
        }

        public Criteria andHouseDtfyEqualTo(BigDecimal value) {
            addCriterion("house_dtfy =", value, "houseDtfy");
            return (Criteria) this;
        }

        public Criteria andHouseDtfyNotEqualTo(BigDecimal value) {
            addCriterion("house_dtfy <>", value, "houseDtfy");
            return (Criteria) this;
        }

        public Criteria andHouseDtfyGreaterThan(BigDecimal value) {
            addCriterion("house_dtfy >", value, "houseDtfy");
            return (Criteria) this;
        }

        public Criteria andHouseDtfyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("house_dtfy >=", value, "houseDtfy");
            return (Criteria) this;
        }

        public Criteria andHouseDtfyLessThan(BigDecimal value) {
            addCriterion("house_dtfy <", value, "houseDtfy");
            return (Criteria) this;
        }

        public Criteria andHouseDtfyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("house_dtfy <=", value, "houseDtfy");
            return (Criteria) this;
        }

        public Criteria andHouseDtfyIn(List<BigDecimal> values) {
            addCriterion("house_dtfy in", values, "houseDtfy");
            return (Criteria) this;
        }

        public Criteria andHouseDtfyNotIn(List<BigDecimal> values) {
            addCriterion("house_dtfy not in", values, "houseDtfy");
            return (Criteria) this;
        }

        public Criteria andHouseDtfyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("house_dtfy between", value1, value2, "houseDtfy");
            return (Criteria) this;
        }

        public Criteria andHouseDtfyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("house_dtfy not between", value1, value2, "houseDtfy");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}