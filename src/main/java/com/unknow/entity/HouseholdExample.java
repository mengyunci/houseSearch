package com.unknow.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HouseholdExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HouseholdExample() {
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

        public Criteria andEmployeeSerialIsNull() {
            addCriterion("employee_serial is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeSerialIsNotNull() {
            addCriterion("employee_serial is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeSerialEqualTo(String value) {
            addCriterion("employee_serial =", value, "employeeSerial");
            return (Criteria) this;
        }

        public Criteria andEmployeeSerialNotEqualTo(String value) {
            addCriterion("employee_serial <>", value, "employeeSerial");
            return (Criteria) this;
        }

        public Criteria andEmployeeSerialGreaterThan(String value) {
            addCriterion("employee_serial >", value, "employeeSerial");
            return (Criteria) this;
        }

        public Criteria andEmployeeSerialGreaterThanOrEqualTo(String value) {
            addCriterion("employee_serial >=", value, "employeeSerial");
            return (Criteria) this;
        }

        public Criteria andEmployeeSerialLessThan(String value) {
            addCriterion("employee_serial <", value, "employeeSerial");
            return (Criteria) this;
        }

        public Criteria andEmployeeSerialLessThanOrEqualTo(String value) {
            addCriterion("employee_serial <=", value, "employeeSerial");
            return (Criteria) this;
        }

        public Criteria andEmployeeSerialLike(String value) {
            addCriterion("employee_serial like", value, "employeeSerial");
            return (Criteria) this;
        }

        public Criteria andEmployeeSerialNotLike(String value) {
            addCriterion("employee_serial not like", value, "employeeSerial");
            return (Criteria) this;
        }

        public Criteria andEmployeeSerialIn(List<String> values) {
            addCriterion("employee_serial in", values, "employeeSerial");
            return (Criteria) this;
        }

        public Criteria andEmployeeSerialNotIn(List<String> values) {
            addCriterion("employee_serial not in", values, "employeeSerial");
            return (Criteria) this;
        }

        public Criteria andEmployeeSerialBetween(String value1, String value2) {
            addCriterion("employee_serial between", value1, value2, "employeeSerial");
            return (Criteria) this;
        }

        public Criteria andEmployeeSerialNotBetween(String value1, String value2) {
            addCriterion("employee_serial not between", value1, value2, "employeeSerial");
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

        public Criteria andHouseholdDateIsNull() {
            addCriterion("household_date is null");
            return (Criteria) this;
        }

        public Criteria andHouseholdDateIsNotNull() {
            addCriterion("household_date is not null");
            return (Criteria) this;
        }

        public Criteria andHouseholdDateEqualTo(Date value) {
            addCriterion("household_date =", value, "householdDate");
            return (Criteria) this;
        }

        public Criteria andHouseholdDateNotEqualTo(Date value) {
            addCriterion("household_date <>", value, "householdDate");
            return (Criteria) this;
        }

        public Criteria andHouseholdDateGreaterThan(Date value) {
            addCriterion("household_date >", value, "householdDate");
            return (Criteria) this;
        }

        public Criteria andHouseholdDateGreaterThanOrEqualTo(Date value) {
            addCriterion("household_date >=", value, "householdDate");
            return (Criteria) this;
        }

        public Criteria andHouseholdDateLessThan(Date value) {
            addCriterion("household_date <", value, "householdDate");
            return (Criteria) this;
        }

        public Criteria andHouseholdDateLessThanOrEqualTo(Date value) {
            addCriterion("household_date <=", value, "householdDate");
            return (Criteria) this;
        }

        public Criteria andHouseholdDateIn(List<Date> values) {
            addCriterion("household_date in", values, "householdDate");
            return (Criteria) this;
        }

        public Criteria andHouseholdDateNotIn(List<Date> values) {
            addCriterion("household_date not in", values, "householdDate");
            return (Criteria) this;
        }

        public Criteria andHouseholdDateBetween(Date value1, Date value2) {
            addCriterion("household_date between", value1, value2, "householdDate");
            return (Criteria) this;
        }

        public Criteria andHouseholdDateNotBetween(Date value1, Date value2) {
            addCriterion("household_date not between", value1, value2, "householdDate");
            return (Criteria) this;
        }

        public Criteria andHouseholdGetIsNull() {
            addCriterion("household_get is null");
            return (Criteria) this;
        }

        public Criteria andHouseholdGetIsNotNull() {
            addCriterion("household_get is not null");
            return (Criteria) this;
        }

        public Criteria andHouseholdGetEqualTo(String value) {
            addCriterion("household_get =", value, "householdGet");
            return (Criteria) this;
        }

        public Criteria andHouseholdGetNotEqualTo(String value) {
            addCriterion("household_get <>", value, "householdGet");
            return (Criteria) this;
        }

        public Criteria andHouseholdGetGreaterThan(String value) {
            addCriterion("household_get >", value, "householdGet");
            return (Criteria) this;
        }

        public Criteria andHouseholdGetGreaterThanOrEqualTo(String value) {
            addCriterion("household_get >=", value, "householdGet");
            return (Criteria) this;
        }

        public Criteria andHouseholdGetLessThan(String value) {
            addCriterion("household_get <", value, "householdGet");
            return (Criteria) this;
        }

        public Criteria andHouseholdGetLessThanOrEqualTo(String value) {
            addCriterion("household_get <=", value, "householdGet");
            return (Criteria) this;
        }

        public Criteria andHouseholdGetLike(String value) {
            addCriterion("household_get like", value, "householdGet");
            return (Criteria) this;
        }

        public Criteria andHouseholdGetNotLike(String value) {
            addCriterion("household_get not like", value, "householdGet");
            return (Criteria) this;
        }

        public Criteria andHouseholdGetIn(List<String> values) {
            addCriterion("household_get in", values, "householdGet");
            return (Criteria) this;
        }

        public Criteria andHouseholdGetNotIn(List<String> values) {
            addCriterion("household_get not in", values, "householdGet");
            return (Criteria) this;
        }

        public Criteria andHouseholdGetBetween(String value1, String value2) {
            addCriterion("household_get between", value1, value2, "householdGet");
            return (Criteria) this;
        }

        public Criteria andHouseholdGetNotBetween(String value1, String value2) {
            addCriterion("household_get not between", value1, value2, "householdGet");
            return (Criteria) this;
        }

        public Criteria andHouseholdTypeIsNull() {
            addCriterion("household_type is null");
            return (Criteria) this;
        }

        public Criteria andHouseholdTypeIsNotNull() {
            addCriterion("household_type is not null");
            return (Criteria) this;
        }

        public Criteria andHouseholdTypeEqualTo(String value) {
            addCriterion("household_type =", value, "householdType");
            return (Criteria) this;
        }

        public Criteria andHouseholdTypeNotEqualTo(String value) {
            addCriterion("household_type <>", value, "householdType");
            return (Criteria) this;
        }

        public Criteria andHouseholdTypeGreaterThan(String value) {
            addCriterion("household_type >", value, "householdType");
            return (Criteria) this;
        }

        public Criteria andHouseholdTypeGreaterThanOrEqualTo(String value) {
            addCriterion("household_type >=", value, "householdType");
            return (Criteria) this;
        }

        public Criteria andHouseholdTypeLessThan(String value) {
            addCriterion("household_type <", value, "householdType");
            return (Criteria) this;
        }

        public Criteria andHouseholdTypeLessThanOrEqualTo(String value) {
            addCriterion("household_type <=", value, "householdType");
            return (Criteria) this;
        }

        public Criteria andHouseholdTypeLike(String value) {
            addCriterion("household_type like", value, "householdType");
            return (Criteria) this;
        }

        public Criteria andHouseholdTypeNotLike(String value) {
            addCriterion("household_type not like", value, "householdType");
            return (Criteria) this;
        }

        public Criteria andHouseholdTypeIn(List<String> values) {
            addCriterion("household_type in", values, "householdType");
            return (Criteria) this;
        }

        public Criteria andHouseholdTypeNotIn(List<String> values) {
            addCriterion("household_type not in", values, "householdType");
            return (Criteria) this;
        }

        public Criteria andHouseholdTypeBetween(String value1, String value2) {
            addCriterion("household_type between", value1, value2, "householdType");
            return (Criteria) this;
        }

        public Criteria andHouseholdTypeNotBetween(String value1, String value2) {
            addCriterion("household_type not between", value1, value2, "householdType");
            return (Criteria) this;
        }

        public Criteria andHouseholdRateIsNull() {
            addCriterion("household_rate is null");
            return (Criteria) this;
        }

        public Criteria andHouseholdRateIsNotNull() {
            addCriterion("household_rate is not null");
            return (Criteria) this;
        }

        public Criteria andHouseholdRateEqualTo(BigDecimal value) {
            addCriterion("household_rate =", value, "householdRate");
            return (Criteria) this;
        }

        public Criteria andHouseholdRateNotEqualTo(BigDecimal value) {
            addCriterion("household_rate <>", value, "householdRate");
            return (Criteria) this;
        }

        public Criteria andHouseholdRateGreaterThan(BigDecimal value) {
            addCriterion("household_rate >", value, "householdRate");
            return (Criteria) this;
        }

        public Criteria andHouseholdRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("household_rate >=", value, "householdRate");
            return (Criteria) this;
        }

        public Criteria andHouseholdRateLessThan(BigDecimal value) {
            addCriterion("household_rate <", value, "householdRate");
            return (Criteria) this;
        }

        public Criteria andHouseholdRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("household_rate <=", value, "householdRate");
            return (Criteria) this;
        }

        public Criteria andHouseholdRateIn(List<BigDecimal> values) {
            addCriterion("household_rate in", values, "householdRate");
            return (Criteria) this;
        }

        public Criteria andHouseholdRateNotIn(List<BigDecimal> values) {
            addCriterion("household_rate not in", values, "householdRate");
            return (Criteria) this;
        }

        public Criteria andHouseholdRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("household_rate between", value1, value2, "householdRate");
            return (Criteria) this;
        }

        public Criteria andHouseholdRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("household_rate not between", value1, value2, "householdRate");
            return (Criteria) this;
        }

        public Criteria andHouseholdCodeIsNull() {
            addCriterion("household_code is null");
            return (Criteria) this;
        }

        public Criteria andHouseholdCodeIsNotNull() {
            addCriterion("household_code is not null");
            return (Criteria) this;
        }

        public Criteria andHouseholdCodeEqualTo(String value) {
            addCriterion("household_code =", value, "householdCode");
            return (Criteria) this;
        }

        public Criteria andHouseholdCodeNotEqualTo(String value) {
            addCriterion("household_code <>", value, "householdCode");
            return (Criteria) this;
        }

        public Criteria andHouseholdCodeGreaterThan(String value) {
            addCriterion("household_code >", value, "householdCode");
            return (Criteria) this;
        }

        public Criteria andHouseholdCodeGreaterThanOrEqualTo(String value) {
            addCriterion("household_code >=", value, "householdCode");
            return (Criteria) this;
        }

        public Criteria andHouseholdCodeLessThan(String value) {
            addCriterion("household_code <", value, "householdCode");
            return (Criteria) this;
        }

        public Criteria andHouseholdCodeLessThanOrEqualTo(String value) {
            addCriterion("household_code <=", value, "householdCode");
            return (Criteria) this;
        }

        public Criteria andHouseholdCodeLike(String value) {
            addCriterion("household_code like", value, "householdCode");
            return (Criteria) this;
        }

        public Criteria andHouseholdCodeNotLike(String value) {
            addCriterion("household_code not like", value, "householdCode");
            return (Criteria) this;
        }

        public Criteria andHouseholdCodeIn(List<String> values) {
            addCriterion("household_code in", values, "householdCode");
            return (Criteria) this;
        }

        public Criteria andHouseholdCodeNotIn(List<String> values) {
            addCriterion("household_code not in", values, "householdCode");
            return (Criteria) this;
        }

        public Criteria andHouseholdCodeBetween(String value1, String value2) {
            addCriterion("household_code between", value1, value2, "householdCode");
            return (Criteria) this;
        }

        public Criteria andHouseholdCodeNotBetween(String value1, String value2) {
            addCriterion("household_code not between", value1, value2, "householdCode");
            return (Criteria) this;
        }

        public Criteria andHouseholdLendIsNull() {
            addCriterion("household_lend is null");
            return (Criteria) this;
        }

        public Criteria andHouseholdLendIsNotNull() {
            addCriterion("household_lend is not null");
            return (Criteria) this;
        }

        public Criteria andHouseholdLendEqualTo(Date value) {
            addCriterion("household_lend =", value, "householdLend");
            return (Criteria) this;
        }

        public Criteria andHouseholdLendNotEqualTo(Date value) {
            addCriterion("household_lend <>", value, "householdLend");
            return (Criteria) this;
        }

        public Criteria andHouseholdLendGreaterThan(Date value) {
            addCriterion("household_lend >", value, "householdLend");
            return (Criteria) this;
        }

        public Criteria andHouseholdLendGreaterThanOrEqualTo(Date value) {
            addCriterion("household_lend >=", value, "householdLend");
            return (Criteria) this;
        }

        public Criteria andHouseholdLendLessThan(Date value) {
            addCriterion("household_lend <", value, "householdLend");
            return (Criteria) this;
        }

        public Criteria andHouseholdLendLessThanOrEqualTo(Date value) {
            addCriterion("household_lend <=", value, "householdLend");
            return (Criteria) this;
        }

        public Criteria andHouseholdLendIn(List<Date> values) {
            addCriterion("household_lend in", values, "householdLend");
            return (Criteria) this;
        }

        public Criteria andHouseholdLendNotIn(List<Date> values) {
            addCriterion("household_lend not in", values, "householdLend");
            return (Criteria) this;
        }

        public Criteria andHouseholdLendBetween(Date value1, Date value2) {
            addCriterion("household_lend between", value1, value2, "householdLend");
            return (Criteria) this;
        }

        public Criteria andHouseholdLendNotBetween(Date value1, Date value2) {
            addCriterion("household_lend not between", value1, value2, "householdLend");
            return (Criteria) this;
        }

        public Criteria andHouseholdPersonIsNull() {
            addCriterion("household_person is null");
            return (Criteria) this;
        }

        public Criteria andHouseholdPersonIsNotNull() {
            addCriterion("household_person is not null");
            return (Criteria) this;
        }

        public Criteria andHouseholdPersonEqualTo(String value) {
            addCriterion("household_person =", value, "householdPerson");
            return (Criteria) this;
        }

        public Criteria andHouseholdPersonNotEqualTo(String value) {
            addCriterion("household_person <>", value, "householdPerson");
            return (Criteria) this;
        }

        public Criteria andHouseholdPersonGreaterThan(String value) {
            addCriterion("household_person >", value, "householdPerson");
            return (Criteria) this;
        }

        public Criteria andHouseholdPersonGreaterThanOrEqualTo(String value) {
            addCriterion("household_person >=", value, "householdPerson");
            return (Criteria) this;
        }

        public Criteria andHouseholdPersonLessThan(String value) {
            addCriterion("household_person <", value, "householdPerson");
            return (Criteria) this;
        }

        public Criteria andHouseholdPersonLessThanOrEqualTo(String value) {
            addCriterion("household_person <=", value, "householdPerson");
            return (Criteria) this;
        }

        public Criteria andHouseholdPersonLike(String value) {
            addCriterion("household_person like", value, "householdPerson");
            return (Criteria) this;
        }

        public Criteria andHouseholdPersonNotLike(String value) {
            addCriterion("household_person not like", value, "householdPerson");
            return (Criteria) this;
        }

        public Criteria andHouseholdPersonIn(List<String> values) {
            addCriterion("household_person in", values, "householdPerson");
            return (Criteria) this;
        }

        public Criteria andHouseholdPersonNotIn(List<String> values) {
            addCriterion("household_person not in", values, "householdPerson");
            return (Criteria) this;
        }

        public Criteria andHouseholdPersonBetween(String value1, String value2) {
            addCriterion("household_person between", value1, value2, "householdPerson");
            return (Criteria) this;
        }

        public Criteria andHouseholdPersonNotBetween(String value1, String value2) {
            addCriterion("household_person not between", value1, value2, "householdPerson");
            return (Criteria) this;
        }

        public Criteria andHouseholdMemIsNull() {
            addCriterion("household_mem is null");
            return (Criteria) this;
        }

        public Criteria andHouseholdMemIsNotNull() {
            addCriterion("household_mem is not null");
            return (Criteria) this;
        }

        public Criteria andHouseholdMemEqualTo(String value) {
            addCriterion("household_mem =", value, "householdMem");
            return (Criteria) this;
        }

        public Criteria andHouseholdMemNotEqualTo(String value) {
            addCriterion("household_mem <>", value, "householdMem");
            return (Criteria) this;
        }

        public Criteria andHouseholdMemGreaterThan(String value) {
            addCriterion("household_mem >", value, "householdMem");
            return (Criteria) this;
        }

        public Criteria andHouseholdMemGreaterThanOrEqualTo(String value) {
            addCriterion("household_mem >=", value, "householdMem");
            return (Criteria) this;
        }

        public Criteria andHouseholdMemLessThan(String value) {
            addCriterion("household_mem <", value, "householdMem");
            return (Criteria) this;
        }

        public Criteria andHouseholdMemLessThanOrEqualTo(String value) {
            addCriterion("household_mem <=", value, "householdMem");
            return (Criteria) this;
        }

        public Criteria andHouseholdMemLike(String value) {
            addCriterion("household_mem like", value, "householdMem");
            return (Criteria) this;
        }

        public Criteria andHouseholdMemNotLike(String value) {
            addCriterion("household_mem not like", value, "householdMem");
            return (Criteria) this;
        }

        public Criteria andHouseholdMemIn(List<String> values) {
            addCriterion("household_mem in", values, "householdMem");
            return (Criteria) this;
        }

        public Criteria andHouseholdMemNotIn(List<String> values) {
            addCriterion("household_mem not in", values, "householdMem");
            return (Criteria) this;
        }

        public Criteria andHouseholdMemBetween(String value1, String value2) {
            addCriterion("household_mem between", value1, value2, "householdMem");
            return (Criteria) this;
        }

        public Criteria andHouseholdMemNotBetween(String value1, String value2) {
            addCriterion("household_mem not between", value1, value2, "householdMem");
            return (Criteria) this;
        }

        public Criteria andHouseholdRentIsNull() {
            addCriterion("household_rent is null");
            return (Criteria) this;
        }

        public Criteria andHouseholdRentIsNotNull() {
            addCriterion("household_rent is not null");
            return (Criteria) this;
        }

        public Criteria andHouseholdRentEqualTo(BigDecimal value) {
            addCriterion("household_rent =", value, "householdRent");
            return (Criteria) this;
        }

        public Criteria andHouseholdRentNotEqualTo(BigDecimal value) {
            addCriterion("household_rent <>", value, "householdRent");
            return (Criteria) this;
        }

        public Criteria andHouseholdRentGreaterThan(BigDecimal value) {
            addCriterion("household_rent >", value, "householdRent");
            return (Criteria) this;
        }

        public Criteria andHouseholdRentGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("household_rent >=", value, "householdRent");
            return (Criteria) this;
        }

        public Criteria andHouseholdRentLessThan(BigDecimal value) {
            addCriterion("household_rent <", value, "householdRent");
            return (Criteria) this;
        }

        public Criteria andHouseholdRentLessThanOrEqualTo(BigDecimal value) {
            addCriterion("household_rent <=", value, "householdRent");
            return (Criteria) this;
        }

        public Criteria andHouseholdRentIn(List<BigDecimal> values) {
            addCriterion("household_rent in", values, "householdRent");
            return (Criteria) this;
        }

        public Criteria andHouseholdRentNotIn(List<BigDecimal> values) {
            addCriterion("household_rent not in", values, "householdRent");
            return (Criteria) this;
        }

        public Criteria andHouseholdRentBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("household_rent between", value1, value2, "householdRent");
            return (Criteria) this;
        }

        public Criteria andHouseholdRentNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("household_rent not between", value1, value2, "householdRent");
            return (Criteria) this;
        }

        public Criteria andHouseholdMethodIsNull() {
            addCriterion("household_method is null");
            return (Criteria) this;
        }

        public Criteria andHouseholdMethodIsNotNull() {
            addCriterion("household_method is not null");
            return (Criteria) this;
        }

        public Criteria andHouseholdMethodEqualTo(String value) {
            addCriterion("household_method =", value, "householdMethod");
            return (Criteria) this;
        }

        public Criteria andHouseholdMethodNotEqualTo(String value) {
            addCriterion("household_method <>", value, "householdMethod");
            return (Criteria) this;
        }

        public Criteria andHouseholdMethodGreaterThan(String value) {
            addCriterion("household_method >", value, "householdMethod");
            return (Criteria) this;
        }

        public Criteria andHouseholdMethodGreaterThanOrEqualTo(String value) {
            addCriterion("household_method >=", value, "householdMethod");
            return (Criteria) this;
        }

        public Criteria andHouseholdMethodLessThan(String value) {
            addCriterion("household_method <", value, "householdMethod");
            return (Criteria) this;
        }

        public Criteria andHouseholdMethodLessThanOrEqualTo(String value) {
            addCriterion("household_method <=", value, "householdMethod");
            return (Criteria) this;
        }

        public Criteria andHouseholdMethodLike(String value) {
            addCriterion("household_method like", value, "householdMethod");
            return (Criteria) this;
        }

        public Criteria andHouseholdMethodNotLike(String value) {
            addCriterion("household_method not like", value, "householdMethod");
            return (Criteria) this;
        }

        public Criteria andHouseholdMethodIn(List<String> values) {
            addCriterion("household_method in", values, "householdMethod");
            return (Criteria) this;
        }

        public Criteria andHouseholdMethodNotIn(List<String> values) {
            addCriterion("household_method not in", values, "householdMethod");
            return (Criteria) this;
        }

        public Criteria andHouseholdMethodBetween(String value1, String value2) {
            addCriterion("household_method between", value1, value2, "householdMethod");
            return (Criteria) this;
        }

        public Criteria andHouseholdMethodNotBetween(String value1, String value2) {
            addCriterion("household_method not between", value1, value2, "householdMethod");
            return (Criteria) this;
        }

        public Criteria andHouseholdFundIsNull() {
            addCriterion("household_fund is null");
            return (Criteria) this;
        }

        public Criteria andHouseholdFundIsNotNull() {
            addCriterion("household_fund is not null");
            return (Criteria) this;
        }

        public Criteria andHouseholdFundEqualTo(BigDecimal value) {
            addCriterion("household_fund =", value, "householdFund");
            return (Criteria) this;
        }

        public Criteria andHouseholdFundNotEqualTo(BigDecimal value) {
            addCriterion("household_fund <>", value, "householdFund");
            return (Criteria) this;
        }

        public Criteria andHouseholdFundGreaterThan(BigDecimal value) {
            addCriterion("household_fund >", value, "householdFund");
            return (Criteria) this;
        }

        public Criteria andHouseholdFundGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("household_fund >=", value, "householdFund");
            return (Criteria) this;
        }

        public Criteria andHouseholdFundLessThan(BigDecimal value) {
            addCriterion("household_fund <", value, "householdFund");
            return (Criteria) this;
        }

        public Criteria andHouseholdFundLessThanOrEqualTo(BigDecimal value) {
            addCriterion("household_fund <=", value, "householdFund");
            return (Criteria) this;
        }

        public Criteria andHouseholdFundIn(List<BigDecimal> values) {
            addCriterion("household_fund in", values, "householdFund");
            return (Criteria) this;
        }

        public Criteria andHouseholdFundNotIn(List<BigDecimal> values) {
            addCriterion("household_fund not in", values, "householdFund");
            return (Criteria) this;
        }

        public Criteria andHouseholdFundBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("household_fund between", value1, value2, "householdFund");
            return (Criteria) this;
        }

        public Criteria andHouseholdFundNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("household_fund not between", value1, value2, "householdFund");
            return (Criteria) this;
        }

        public Criteria andHouseholdDayIsNull() {
            addCriterion("household_day is null");
            return (Criteria) this;
        }

        public Criteria andHouseholdDayIsNotNull() {
            addCriterion("household_day is not null");
            return (Criteria) this;
        }

        public Criteria andHouseholdDayEqualTo(Date value) {
            addCriterion("household_day =", value, "householdDay");
            return (Criteria) this;
        }

        public Criteria andHouseholdDayNotEqualTo(Date value) {
            addCriterion("household_day <>", value, "householdDay");
            return (Criteria) this;
        }

        public Criteria andHouseholdDayGreaterThan(Date value) {
            addCriterion("household_day >", value, "householdDay");
            return (Criteria) this;
        }

        public Criteria andHouseholdDayGreaterThanOrEqualTo(Date value) {
            addCriterion("household_day >=", value, "householdDay");
            return (Criteria) this;
        }

        public Criteria andHouseholdDayLessThan(Date value) {
            addCriterion("household_day <", value, "householdDay");
            return (Criteria) this;
        }

        public Criteria andHouseholdDayLessThanOrEqualTo(Date value) {
            addCriterion("household_day <=", value, "householdDay");
            return (Criteria) this;
        }

        public Criteria andHouseholdDayIn(List<Date> values) {
            addCriterion("household_day in", values, "householdDay");
            return (Criteria) this;
        }

        public Criteria andHouseholdDayNotIn(List<Date> values) {
            addCriterion("household_day not in", values, "householdDay");
            return (Criteria) this;
        }

        public Criteria andHouseholdDayBetween(Date value1, Date value2) {
            addCriterion("household_day between", value1, value2, "householdDay");
            return (Criteria) this;
        }

        public Criteria andHouseholdDayNotBetween(Date value1, Date value2) {
            addCriterion("household_day not between", value1, value2, "householdDay");
            return (Criteria) this;
        }

        public Criteria andXhIsNull() {
            addCriterion("xh is null");
            return (Criteria) this;
        }

        public Criteria andXhIsNotNull() {
            addCriterion("xh is not null");
            return (Criteria) this;
        }

        public Criteria andXhEqualTo(Integer value) {
            addCriterion("xh =", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhNotEqualTo(Integer value) {
            addCriterion("xh <>", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhGreaterThan(Integer value) {
            addCriterion("xh >", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhGreaterThanOrEqualTo(Integer value) {
            addCriterion("xh >=", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhLessThan(Integer value) {
            addCriterion("xh <", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhLessThanOrEqualTo(Integer value) {
            addCriterion("xh <=", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhIn(List<Integer> values) {
            addCriterion("xh in", values, "xh");
            return (Criteria) this;
        }

        public Criteria andXhNotIn(List<Integer> values) {
            addCriterion("xh not in", values, "xh");
            return (Criteria) this;
        }

        public Criteria andXhBetween(Integer value1, Integer value2) {
            addCriterion("xh between", value1, value2, "xh");
            return (Criteria) this;
        }

        public Criteria andXhNotBetween(Integer value1, Integer value2) {
            addCriterion("xh not between", value1, value2, "xh");
            return (Criteria) this;
        }

        public Criteria andHouseholdZujbtIsNull() {
            addCriterion("household_zujbt is null");
            return (Criteria) this;
        }

        public Criteria andHouseholdZujbtIsNotNull() {
            addCriterion("household_zujbt is not null");
            return (Criteria) this;
        }

        public Criteria andHouseholdZujbtEqualTo(BigDecimal value) {
            addCriterion("household_zujbt =", value, "householdZujbt");
            return (Criteria) this;
        }

        public Criteria andHouseholdZujbtNotEqualTo(BigDecimal value) {
            addCriterion("household_zujbt <>", value, "householdZujbt");
            return (Criteria) this;
        }

        public Criteria andHouseholdZujbtGreaterThan(BigDecimal value) {
            addCriterion("household_zujbt >", value, "householdZujbt");
            return (Criteria) this;
        }

        public Criteria andHouseholdZujbtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("household_zujbt >=", value, "householdZujbt");
            return (Criteria) this;
        }

        public Criteria andHouseholdZujbtLessThan(BigDecimal value) {
            addCriterion("household_zujbt <", value, "householdZujbt");
            return (Criteria) this;
        }

        public Criteria andHouseholdZujbtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("household_zujbt <=", value, "householdZujbt");
            return (Criteria) this;
        }

        public Criteria andHouseholdZujbtIn(List<BigDecimal> values) {
            addCriterion("household_zujbt in", values, "householdZujbt");
            return (Criteria) this;
        }

        public Criteria andHouseholdZujbtNotIn(List<BigDecimal> values) {
            addCriterion("household_zujbt not in", values, "householdZujbt");
            return (Criteria) this;
        }

        public Criteria andHouseholdZujbtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("household_zujbt between", value1, value2, "householdZujbt");
            return (Criteria) this;
        }

        public Criteria andHouseholdZujbtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("household_zujbt not between", value1, value2, "householdZujbt");
            return (Criteria) this;
        }

        public Criteria andHouseholdFzjsgsIsNull() {
            addCriterion("household_fzjsgs is null");
            return (Criteria) this;
        }

        public Criteria andHouseholdFzjsgsIsNotNull() {
            addCriterion("household_fzjsgs is not null");
            return (Criteria) this;
        }

        public Criteria andHouseholdFzjsgsEqualTo(String value) {
            addCriterion("household_fzjsgs =", value, "householdFzjsgs");
            return (Criteria) this;
        }

        public Criteria andHouseholdFzjsgsNotEqualTo(String value) {
            addCriterion("household_fzjsgs <>", value, "householdFzjsgs");
            return (Criteria) this;
        }

        public Criteria andHouseholdFzjsgsGreaterThan(String value) {
            addCriterion("household_fzjsgs >", value, "householdFzjsgs");
            return (Criteria) this;
        }

        public Criteria andHouseholdFzjsgsGreaterThanOrEqualTo(String value) {
            addCriterion("household_fzjsgs >=", value, "householdFzjsgs");
            return (Criteria) this;
        }

        public Criteria andHouseholdFzjsgsLessThan(String value) {
            addCriterion("household_fzjsgs <", value, "householdFzjsgs");
            return (Criteria) this;
        }

        public Criteria andHouseholdFzjsgsLessThanOrEqualTo(String value) {
            addCriterion("household_fzjsgs <=", value, "householdFzjsgs");
            return (Criteria) this;
        }

        public Criteria andHouseholdFzjsgsLike(String value) {
            addCriterion("household_fzjsgs like", value, "householdFzjsgs");
            return (Criteria) this;
        }

        public Criteria andHouseholdFzjsgsNotLike(String value) {
            addCriterion("household_fzjsgs not like", value, "householdFzjsgs");
            return (Criteria) this;
        }

        public Criteria andHouseholdFzjsgsIn(List<String> values) {
            addCriterion("household_fzjsgs in", values, "householdFzjsgs");
            return (Criteria) this;
        }

        public Criteria andHouseholdFzjsgsNotIn(List<String> values) {
            addCriterion("household_fzjsgs not in", values, "householdFzjsgs");
            return (Criteria) this;
        }

        public Criteria andHouseholdFzjsgsBetween(String value1, String value2) {
            addCriterion("household_fzjsgs between", value1, value2, "householdFzjsgs");
            return (Criteria) this;
        }

        public Criteria andHouseholdFzjsgsNotBetween(String value1, String value2) {
            addCriterion("household_fzjsgs not between", value1, value2, "householdFzjsgs");
            return (Criteria) this;
        }

        public Criteria andHouseholdYtkIsNull() {
            addCriterion("household_ytk is null");
            return (Criteria) this;
        }

        public Criteria andHouseholdYtkIsNotNull() {
            addCriterion("household_ytk is not null");
            return (Criteria) this;
        }

        public Criteria andHouseholdYtkEqualTo(String value) {
            addCriterion("household_ytk =", value, "householdYtk");
            return (Criteria) this;
        }

        public Criteria andHouseholdYtkNotEqualTo(String value) {
            addCriterion("household_ytk <>", value, "householdYtk");
            return (Criteria) this;
        }

        public Criteria andHouseholdYtkGreaterThan(String value) {
            addCriterion("household_ytk >", value, "householdYtk");
            return (Criteria) this;
        }

        public Criteria andHouseholdYtkGreaterThanOrEqualTo(String value) {
            addCriterion("household_ytk >=", value, "householdYtk");
            return (Criteria) this;
        }

        public Criteria andHouseholdYtkLessThan(String value) {
            addCriterion("household_ytk <", value, "householdYtk");
            return (Criteria) this;
        }

        public Criteria andHouseholdYtkLessThanOrEqualTo(String value) {
            addCriterion("household_ytk <=", value, "householdYtk");
            return (Criteria) this;
        }

        public Criteria andHouseholdYtkLike(String value) {
            addCriterion("household_ytk like", value, "householdYtk");
            return (Criteria) this;
        }

        public Criteria andHouseholdYtkNotLike(String value) {
            addCriterion("household_ytk not like", value, "householdYtk");
            return (Criteria) this;
        }

        public Criteria andHouseholdYtkIn(List<String> values) {
            addCriterion("household_ytk in", values, "householdYtk");
            return (Criteria) this;
        }

        public Criteria andHouseholdYtkNotIn(List<String> values) {
            addCriterion("household_ytk not in", values, "householdYtk");
            return (Criteria) this;
        }

        public Criteria andHouseholdYtkBetween(String value1, String value2) {
            addCriterion("household_ytk between", value1, value2, "householdYtk");
            return (Criteria) this;
        }

        public Criteria andHouseholdYtkNotBetween(String value1, String value2) {
            addCriterion("household_ytk not between", value1, value2, "householdYtk");
            return (Criteria) this;
        }

        public Criteria andHouseholdYtkdateIsNull() {
            addCriterion("household_ytkdate is null");
            return (Criteria) this;
        }

        public Criteria andHouseholdYtkdateIsNotNull() {
            addCriterion("household_ytkdate is not null");
            return (Criteria) this;
        }

        public Criteria andHouseholdYtkdateEqualTo(Date value) {
            addCriterion("household_ytkdate =", value, "householdYtkdate");
            return (Criteria) this;
        }

        public Criteria andHouseholdYtkdateNotEqualTo(Date value) {
            addCriterion("household_ytkdate <>", value, "householdYtkdate");
            return (Criteria) this;
        }

        public Criteria andHouseholdYtkdateGreaterThan(Date value) {
            addCriterion("household_ytkdate >", value, "householdYtkdate");
            return (Criteria) this;
        }

        public Criteria andHouseholdYtkdateGreaterThanOrEqualTo(Date value) {
            addCriterion("household_ytkdate >=", value, "householdYtkdate");
            return (Criteria) this;
        }

        public Criteria andHouseholdYtkdateLessThan(Date value) {
            addCriterion("household_ytkdate <", value, "householdYtkdate");
            return (Criteria) this;
        }

        public Criteria andHouseholdYtkdateLessThanOrEqualTo(Date value) {
            addCriterion("household_ytkdate <=", value, "householdYtkdate");
            return (Criteria) this;
        }

        public Criteria andHouseholdYtkdateIn(List<Date> values) {
            addCriterion("household_ytkdate in", values, "householdYtkdate");
            return (Criteria) this;
        }

        public Criteria andHouseholdYtkdateNotIn(List<Date> values) {
            addCriterion("household_ytkdate not in", values, "householdYtkdate");
            return (Criteria) this;
        }

        public Criteria andHouseholdYtkdateBetween(Date value1, Date value2) {
            addCriterion("household_ytkdate between", value1, value2, "householdYtkdate");
            return (Criteria) this;
        }

        public Criteria andHouseholdYtkdateNotBetween(Date value1, Date value2) {
            addCriterion("household_ytkdate not between", value1, value2, "householdYtkdate");
            return (Criteria) this;
        }

        public Criteria andHouseholdBzzjIsNull() {
            addCriterion("household_bzzj is null");
            return (Criteria) this;
        }

        public Criteria andHouseholdBzzjIsNotNull() {
            addCriterion("household_bzzj is not null");
            return (Criteria) this;
        }

        public Criteria andHouseholdBzzjEqualTo(String value) {
            addCriterion("household_bzzj =", value, "householdBzzj");
            return (Criteria) this;
        }

        public Criteria andHouseholdBzzjNotEqualTo(String value) {
            addCriterion("household_bzzj <>", value, "householdBzzj");
            return (Criteria) this;
        }

        public Criteria andHouseholdBzzjGreaterThan(String value) {
            addCriterion("household_bzzj >", value, "householdBzzj");
            return (Criteria) this;
        }

        public Criteria andHouseholdBzzjGreaterThanOrEqualTo(String value) {
            addCriterion("household_bzzj >=", value, "householdBzzj");
            return (Criteria) this;
        }

        public Criteria andHouseholdBzzjLessThan(String value) {
            addCriterion("household_bzzj <", value, "householdBzzj");
            return (Criteria) this;
        }

        public Criteria andHouseholdBzzjLessThanOrEqualTo(String value) {
            addCriterion("household_bzzj <=", value, "householdBzzj");
            return (Criteria) this;
        }

        public Criteria andHouseholdBzzjLike(String value) {
            addCriterion("household_bzzj like", value, "householdBzzj");
            return (Criteria) this;
        }

        public Criteria andHouseholdBzzjNotLike(String value) {
            addCriterion("household_bzzj not like", value, "householdBzzj");
            return (Criteria) this;
        }

        public Criteria andHouseholdBzzjIn(List<String> values) {
            addCriterion("household_bzzj in", values, "householdBzzj");
            return (Criteria) this;
        }

        public Criteria andHouseholdBzzjNotIn(List<String> values) {
            addCriterion("household_bzzj not in", values, "householdBzzj");
            return (Criteria) this;
        }

        public Criteria andHouseholdBzzjBetween(String value1, String value2) {
            addCriterion("household_bzzj between", value1, value2, "householdBzzj");
            return (Criteria) this;
        }

        public Criteria andHouseholdBzzjNotBetween(String value1, String value2) {
            addCriterion("household_bzzj not between", value1, value2, "householdBzzj");
            return (Criteria) this;
        }

        public Criteria andHouseholdBzzjcodeIsNull() {
            addCriterion("household_bzzjcode is null");
            return (Criteria) this;
        }

        public Criteria andHouseholdBzzjcodeIsNotNull() {
            addCriterion("household_bzzjcode is not null");
            return (Criteria) this;
        }

        public Criteria andHouseholdBzzjcodeEqualTo(String value) {
            addCriterion("household_bzzjcode =", value, "householdBzzjcode");
            return (Criteria) this;
        }

        public Criteria andHouseholdBzzjcodeNotEqualTo(String value) {
            addCriterion("household_bzzjcode <>", value, "householdBzzjcode");
            return (Criteria) this;
        }

        public Criteria andHouseholdBzzjcodeGreaterThan(String value) {
            addCriterion("household_bzzjcode >", value, "householdBzzjcode");
            return (Criteria) this;
        }

        public Criteria andHouseholdBzzjcodeGreaterThanOrEqualTo(String value) {
            addCriterion("household_bzzjcode >=", value, "householdBzzjcode");
            return (Criteria) this;
        }

        public Criteria andHouseholdBzzjcodeLessThan(String value) {
            addCriterion("household_bzzjcode <", value, "householdBzzjcode");
            return (Criteria) this;
        }

        public Criteria andHouseholdBzzjcodeLessThanOrEqualTo(String value) {
            addCriterion("household_bzzjcode <=", value, "householdBzzjcode");
            return (Criteria) this;
        }

        public Criteria andHouseholdBzzjcodeLike(String value) {
            addCriterion("household_bzzjcode like", value, "householdBzzjcode");
            return (Criteria) this;
        }

        public Criteria andHouseholdBzzjcodeNotLike(String value) {
            addCriterion("household_bzzjcode not like", value, "householdBzzjcode");
            return (Criteria) this;
        }

        public Criteria andHouseholdBzzjcodeIn(List<String> values) {
            addCriterion("household_bzzjcode in", values, "householdBzzjcode");
            return (Criteria) this;
        }

        public Criteria andHouseholdBzzjcodeNotIn(List<String> values) {
            addCriterion("household_bzzjcode not in", values, "householdBzzjcode");
            return (Criteria) this;
        }

        public Criteria andHouseholdBzzjcodeBetween(String value1, String value2) {
            addCriterion("household_bzzjcode between", value1, value2, "householdBzzjcode");
            return (Criteria) this;
        }

        public Criteria andHouseholdBzzjcodeNotBetween(String value1, String value2) {
            addCriterion("household_bzzjcode not between", value1, value2, "householdBzzjcode");
            return (Criteria) this;
        }

        public Criteria andHouseholdFjgsIsNull() {
            addCriterion("household_fjgs is null");
            return (Criteria) this;
        }

        public Criteria andHouseholdFjgsIsNotNull() {
            addCriterion("household_fjgs is not null");
            return (Criteria) this;
        }

        public Criteria andHouseholdFjgsEqualTo(String value) {
            addCriterion("household_fjgs =", value, "householdFjgs");
            return (Criteria) this;
        }

        public Criteria andHouseholdFjgsNotEqualTo(String value) {
            addCriterion("household_fjgs <>", value, "householdFjgs");
            return (Criteria) this;
        }

        public Criteria andHouseholdFjgsGreaterThan(String value) {
            addCriterion("household_fjgs >", value, "householdFjgs");
            return (Criteria) this;
        }

        public Criteria andHouseholdFjgsGreaterThanOrEqualTo(String value) {
            addCriterion("household_fjgs >=", value, "householdFjgs");
            return (Criteria) this;
        }

        public Criteria andHouseholdFjgsLessThan(String value) {
            addCriterion("household_fjgs <", value, "householdFjgs");
            return (Criteria) this;
        }

        public Criteria andHouseholdFjgsLessThanOrEqualTo(String value) {
            addCriterion("household_fjgs <=", value, "householdFjgs");
            return (Criteria) this;
        }

        public Criteria andHouseholdFjgsLike(String value) {
            addCriterion("household_fjgs like", value, "householdFjgs");
            return (Criteria) this;
        }

        public Criteria andHouseholdFjgsNotLike(String value) {
            addCriterion("household_fjgs not like", value, "householdFjgs");
            return (Criteria) this;
        }

        public Criteria andHouseholdFjgsIn(List<String> values) {
            addCriterion("household_fjgs in", values, "householdFjgs");
            return (Criteria) this;
        }

        public Criteria andHouseholdFjgsNotIn(List<String> values) {
            addCriterion("household_fjgs not in", values, "householdFjgs");
            return (Criteria) this;
        }

        public Criteria andHouseholdFjgsBetween(String value1, String value2) {
            addCriterion("household_fjgs between", value1, value2, "householdFjgs");
            return (Criteria) this;
        }

        public Criteria andHouseholdFjgsNotBetween(String value1, String value2) {
            addCriterion("household_fjgs not between", value1, value2, "householdFjgs");
            return (Criteria) this;
        }

        public Criteria andHouseholdFjjeIsNull() {
            addCriterion("household_fjje is null");
            return (Criteria) this;
        }

        public Criteria andHouseholdFjjeIsNotNull() {
            addCriterion("household_fjje is not null");
            return (Criteria) this;
        }

        public Criteria andHouseholdFjjeEqualTo(BigDecimal value) {
            addCriterion("household_fjje =", value, "householdFjje");
            return (Criteria) this;
        }

        public Criteria andHouseholdFjjeNotEqualTo(BigDecimal value) {
            addCriterion("household_fjje <>", value, "householdFjje");
            return (Criteria) this;
        }

        public Criteria andHouseholdFjjeGreaterThan(BigDecimal value) {
            addCriterion("household_fjje >", value, "householdFjje");
            return (Criteria) this;
        }

        public Criteria andHouseholdFjjeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("household_fjje >=", value, "householdFjje");
            return (Criteria) this;
        }

        public Criteria andHouseholdFjjeLessThan(BigDecimal value) {
            addCriterion("household_fjje <", value, "householdFjje");
            return (Criteria) this;
        }

        public Criteria andHouseholdFjjeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("household_fjje <=", value, "householdFjje");
            return (Criteria) this;
        }

        public Criteria andHouseholdFjjeIn(List<BigDecimal> values) {
            addCriterion("household_fjje in", values, "householdFjje");
            return (Criteria) this;
        }

        public Criteria andHouseholdFjjeNotIn(List<BigDecimal> values) {
            addCriterion("household_fjje not in", values, "householdFjje");
            return (Criteria) this;
        }

        public Criteria andHouseholdFjjeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("household_fjje between", value1, value2, "householdFjje");
            return (Criteria) this;
        }

        public Criteria andHouseholdFjjeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("household_fjje not between", value1, value2, "householdFjje");
            return (Criteria) this;
        }

        public Criteria andHouseholdZjtiaoIsNull() {
            addCriterion("household_zjtiao is null");
            return (Criteria) this;
        }

        public Criteria andHouseholdZjtiaoIsNotNull() {
            addCriterion("household_zjtiao is not null");
            return (Criteria) this;
        }

        public Criteria andHouseholdZjtiaoEqualTo(BigDecimal value) {
            addCriterion("household_zjtiao =", value, "householdZjtiao");
            return (Criteria) this;
        }

        public Criteria andHouseholdZjtiaoNotEqualTo(BigDecimal value) {
            addCriterion("household_zjtiao <>", value, "householdZjtiao");
            return (Criteria) this;
        }

        public Criteria andHouseholdZjtiaoGreaterThan(BigDecimal value) {
            addCriterion("household_zjtiao >", value, "householdZjtiao");
            return (Criteria) this;
        }

        public Criteria andHouseholdZjtiaoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("household_zjtiao >=", value, "householdZjtiao");
            return (Criteria) this;
        }

        public Criteria andHouseholdZjtiaoLessThan(BigDecimal value) {
            addCriterion("household_zjtiao <", value, "householdZjtiao");
            return (Criteria) this;
        }

        public Criteria andHouseholdZjtiaoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("household_zjtiao <=", value, "householdZjtiao");
            return (Criteria) this;
        }

        public Criteria andHouseholdZjtiaoIn(List<BigDecimal> values) {
            addCriterion("household_zjtiao in", values, "householdZjtiao");
            return (Criteria) this;
        }

        public Criteria andHouseholdZjtiaoNotIn(List<BigDecimal> values) {
            addCriterion("household_zjtiao not in", values, "householdZjtiao");
            return (Criteria) this;
        }

        public Criteria andHouseholdZjtiaoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("household_zjtiao between", value1, value2, "householdZjtiao");
            return (Criteria) this;
        }

        public Criteria andHouseholdZjtiaoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("household_zjtiao not between", value1, value2, "householdZjtiao");
            return (Criteria) this;
        }

        public Criteria andHouseholdZjchaoqiIsNull() {
            addCriterion("household_zjchaoqi is null");
            return (Criteria) this;
        }

        public Criteria andHouseholdZjchaoqiIsNotNull() {
            addCriterion("household_zjchaoqi is not null");
            return (Criteria) this;
        }

        public Criteria andHouseholdZjchaoqiEqualTo(BigDecimal value) {
            addCriterion("household_zjchaoqi =", value, "householdZjchaoqi");
            return (Criteria) this;
        }

        public Criteria andHouseholdZjchaoqiNotEqualTo(BigDecimal value) {
            addCriterion("household_zjchaoqi <>", value, "householdZjchaoqi");
            return (Criteria) this;
        }

        public Criteria andHouseholdZjchaoqiGreaterThan(BigDecimal value) {
            addCriterion("household_zjchaoqi >", value, "householdZjchaoqi");
            return (Criteria) this;
        }

        public Criteria andHouseholdZjchaoqiGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("household_zjchaoqi >=", value, "householdZjchaoqi");
            return (Criteria) this;
        }

        public Criteria andHouseholdZjchaoqiLessThan(BigDecimal value) {
            addCriterion("household_zjchaoqi <", value, "householdZjchaoqi");
            return (Criteria) this;
        }

        public Criteria andHouseholdZjchaoqiLessThanOrEqualTo(BigDecimal value) {
            addCriterion("household_zjchaoqi <=", value, "householdZjchaoqi");
            return (Criteria) this;
        }

        public Criteria andHouseholdZjchaoqiIn(List<BigDecimal> values) {
            addCriterion("household_zjchaoqi in", values, "householdZjchaoqi");
            return (Criteria) this;
        }

        public Criteria andHouseholdZjchaoqiNotIn(List<BigDecimal> values) {
            addCriterion("household_zjchaoqi not in", values, "householdZjchaoqi");
            return (Criteria) this;
        }

        public Criteria andHouseholdZjchaoqiBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("household_zjchaoqi between", value1, value2, "householdZjchaoqi");
            return (Criteria) this;
        }

        public Criteria andHouseholdZjchaoqiNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("household_zjchaoqi not between", value1, value2, "householdZjchaoqi");
            return (Criteria) this;
        }

        public Criteria andHouseholdSumzjIsNull() {
            addCriterion("household_sumzj is null");
            return (Criteria) this;
        }

        public Criteria andHouseholdSumzjIsNotNull() {
            addCriterion("household_sumzj is not null");
            return (Criteria) this;
        }

        public Criteria andHouseholdSumzjEqualTo(BigDecimal value) {
            addCriterion("household_sumzj =", value, "householdSumzj");
            return (Criteria) this;
        }

        public Criteria andHouseholdSumzjNotEqualTo(BigDecimal value) {
            addCriterion("household_sumzj <>", value, "householdSumzj");
            return (Criteria) this;
        }

        public Criteria andHouseholdSumzjGreaterThan(BigDecimal value) {
            addCriterion("household_sumzj >", value, "householdSumzj");
            return (Criteria) this;
        }

        public Criteria andHouseholdSumzjGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("household_sumzj >=", value, "householdSumzj");
            return (Criteria) this;
        }

        public Criteria andHouseholdSumzjLessThan(BigDecimal value) {
            addCriterion("household_sumzj <", value, "householdSumzj");
            return (Criteria) this;
        }

        public Criteria andHouseholdSumzjLessThanOrEqualTo(BigDecimal value) {
            addCriterion("household_sumzj <=", value, "householdSumzj");
            return (Criteria) this;
        }

        public Criteria andHouseholdSumzjIn(List<BigDecimal> values) {
            addCriterion("household_sumzj in", values, "householdSumzj");
            return (Criteria) this;
        }

        public Criteria andHouseholdSumzjNotIn(List<BigDecimal> values) {
            addCriterion("household_sumzj not in", values, "householdSumzj");
            return (Criteria) this;
        }

        public Criteria andHouseholdSumzjBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("household_sumzj between", value1, value2, "householdSumzj");
            return (Criteria) this;
        }

        public Criteria andHouseholdSumzjNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("household_sumzj not between", value1, value2, "householdSumzj");
            return (Criteria) this;
        }

        public Criteria andHouseholdBeluIsNull() {
            addCriterion("household_belu is null");
            return (Criteria) this;
        }

        public Criteria andHouseholdBeluIsNotNull() {
            addCriterion("household_belu is not null");
            return (Criteria) this;
        }

        public Criteria andHouseholdBeluEqualTo(BigDecimal value) {
            addCriterion("household_belu =", value, "householdBelu");
            return (Criteria) this;
        }

        public Criteria andHouseholdBeluNotEqualTo(BigDecimal value) {
            addCriterion("household_belu <>", value, "householdBelu");
            return (Criteria) this;
        }

        public Criteria andHouseholdBeluGreaterThan(BigDecimal value) {
            addCriterion("household_belu >", value, "householdBelu");
            return (Criteria) this;
        }

        public Criteria andHouseholdBeluGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("household_belu >=", value, "householdBelu");
            return (Criteria) this;
        }

        public Criteria andHouseholdBeluLessThan(BigDecimal value) {
            addCriterion("household_belu <", value, "householdBelu");
            return (Criteria) this;
        }

        public Criteria andHouseholdBeluLessThanOrEqualTo(BigDecimal value) {
            addCriterion("household_belu <=", value, "householdBelu");
            return (Criteria) this;
        }

        public Criteria andHouseholdBeluIn(List<BigDecimal> values) {
            addCriterion("household_belu in", values, "householdBelu");
            return (Criteria) this;
        }

        public Criteria andHouseholdBeluNotIn(List<BigDecimal> values) {
            addCriterion("household_belu not in", values, "householdBelu");
            return (Criteria) this;
        }

        public Criteria andHouseholdBeluBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("household_belu between", value1, value2, "householdBelu");
            return (Criteria) this;
        }

        public Criteria andHouseholdBeluNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("household_belu not between", value1, value2, "householdBelu");
            return (Criteria) this;
        }

        public Criteria andHouseholdTufstatIsNull() {
            addCriterion("household_tufstat is null");
            return (Criteria) this;
        }

        public Criteria andHouseholdTufstatIsNotNull() {
            addCriterion("household_tufstat is not null");
            return (Criteria) this;
        }

        public Criteria andHouseholdTufstatEqualTo(String value) {
            addCriterion("household_tufstat =", value, "householdTufstat");
            return (Criteria) this;
        }

        public Criteria andHouseholdTufstatNotEqualTo(String value) {
            addCriterion("household_tufstat <>", value, "householdTufstat");
            return (Criteria) this;
        }

        public Criteria andHouseholdTufstatGreaterThan(String value) {
            addCriterion("household_tufstat >", value, "householdTufstat");
            return (Criteria) this;
        }

        public Criteria andHouseholdTufstatGreaterThanOrEqualTo(String value) {
            addCriterion("household_tufstat >=", value, "householdTufstat");
            return (Criteria) this;
        }

        public Criteria andHouseholdTufstatLessThan(String value) {
            addCriterion("household_tufstat <", value, "householdTufstat");
            return (Criteria) this;
        }

        public Criteria andHouseholdTufstatLessThanOrEqualTo(String value) {
            addCriterion("household_tufstat <=", value, "householdTufstat");
            return (Criteria) this;
        }

        public Criteria andHouseholdTufstatLike(String value) {
            addCriterion("household_tufstat like", value, "householdTufstat");
            return (Criteria) this;
        }

        public Criteria andHouseholdTufstatNotLike(String value) {
            addCriterion("household_tufstat not like", value, "householdTufstat");
            return (Criteria) this;
        }

        public Criteria andHouseholdTufstatIn(List<String> values) {
            addCriterion("household_tufstat in", values, "householdTufstat");
            return (Criteria) this;
        }

        public Criteria andHouseholdTufstatNotIn(List<String> values) {
            addCriterion("household_tufstat not in", values, "householdTufstat");
            return (Criteria) this;
        }

        public Criteria andHouseholdTufstatBetween(String value1, String value2) {
            addCriterion("household_tufstat between", value1, value2, "householdTufstat");
            return (Criteria) this;
        }

        public Criteria andHouseholdTufstatNotBetween(String value1, String value2) {
            addCriterion("household_tufstat not between", value1, value2, "householdTufstat");
            return (Criteria) this;
        }

        public Criteria andHouseholdXsmjIsNull() {
            addCriterion("household_xsmj is null");
            return (Criteria) this;
        }

        public Criteria andHouseholdXsmjIsNotNull() {
            addCriterion("household_xsmj is not null");
            return (Criteria) this;
        }

        public Criteria andHouseholdXsmjEqualTo(BigDecimal value) {
            addCriterion("household_xsmj =", value, "householdXsmj");
            return (Criteria) this;
        }

        public Criteria andHouseholdXsmjNotEqualTo(BigDecimal value) {
            addCriterion("household_xsmj <>", value, "householdXsmj");
            return (Criteria) this;
        }

        public Criteria andHouseholdXsmjGreaterThan(BigDecimal value) {
            addCriterion("household_xsmj >", value, "householdXsmj");
            return (Criteria) this;
        }

        public Criteria andHouseholdXsmjGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("household_xsmj >=", value, "householdXsmj");
            return (Criteria) this;
        }

        public Criteria andHouseholdXsmjLessThan(BigDecimal value) {
            addCriterion("household_xsmj <", value, "householdXsmj");
            return (Criteria) this;
        }

        public Criteria andHouseholdXsmjLessThanOrEqualTo(BigDecimal value) {
            addCriterion("household_xsmj <=", value, "householdXsmj");
            return (Criteria) this;
        }

        public Criteria andHouseholdXsmjIn(List<BigDecimal> values) {
            addCriterion("household_xsmj in", values, "householdXsmj");
            return (Criteria) this;
        }

        public Criteria andHouseholdXsmjNotIn(List<BigDecimal> values) {
            addCriterion("household_xsmj not in", values, "householdXsmj");
            return (Criteria) this;
        }

        public Criteria andHouseholdXsmjBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("household_xsmj between", value1, value2, "householdXsmj");
            return (Criteria) this;
        }

        public Criteria andHouseholdXsmjNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("household_xsmj not between", value1, value2, "householdXsmj");
            return (Criteria) this;
        }

        public Criteria andHouseholdCbjIsNull() {
            addCriterion("household_cbj is null");
            return (Criteria) this;
        }

        public Criteria andHouseholdCbjIsNotNull() {
            addCriterion("household_cbj is not null");
            return (Criteria) this;
        }

        public Criteria andHouseholdCbjEqualTo(BigDecimal value) {
            addCriterion("household_cbj =", value, "householdCbj");
            return (Criteria) this;
        }

        public Criteria andHouseholdCbjNotEqualTo(BigDecimal value) {
            addCriterion("household_cbj <>", value, "householdCbj");
            return (Criteria) this;
        }

        public Criteria andHouseholdCbjGreaterThan(BigDecimal value) {
            addCriterion("household_cbj >", value, "householdCbj");
            return (Criteria) this;
        }

        public Criteria andHouseholdCbjGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("household_cbj >=", value, "householdCbj");
            return (Criteria) this;
        }

        public Criteria andHouseholdCbjLessThan(BigDecimal value) {
            addCriterion("household_cbj <", value, "householdCbj");
            return (Criteria) this;
        }

        public Criteria andHouseholdCbjLessThanOrEqualTo(BigDecimal value) {
            addCriterion("household_cbj <=", value, "householdCbj");
            return (Criteria) this;
        }

        public Criteria andHouseholdCbjIn(List<BigDecimal> values) {
            addCriterion("household_cbj in", values, "householdCbj");
            return (Criteria) this;
        }

        public Criteria andHouseholdCbjNotIn(List<BigDecimal> values) {
            addCriterion("household_cbj not in", values, "householdCbj");
            return (Criteria) this;
        }

        public Criteria andHouseholdCbjBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("household_cbj between", value1, value2, "householdCbj");
            return (Criteria) this;
        }

        public Criteria andHouseholdCbjNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("household_cbj not between", value1, value2, "householdCbj");
            return (Criteria) this;
        }

        public Criteria andHouseholdBzjIsNull() {
            addCriterion("household_bzj is null");
            return (Criteria) this;
        }

        public Criteria andHouseholdBzjIsNotNull() {
            addCriterion("household_bzj is not null");
            return (Criteria) this;
        }

        public Criteria andHouseholdBzjEqualTo(BigDecimal value) {
            addCriterion("household_bzj =", value, "householdBzj");
            return (Criteria) this;
        }

        public Criteria andHouseholdBzjNotEqualTo(BigDecimal value) {
            addCriterion("household_bzj <>", value, "householdBzj");
            return (Criteria) this;
        }

        public Criteria andHouseholdBzjGreaterThan(BigDecimal value) {
            addCriterion("household_bzj >", value, "householdBzj");
            return (Criteria) this;
        }

        public Criteria andHouseholdBzjGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("household_bzj >=", value, "householdBzj");
            return (Criteria) this;
        }

        public Criteria andHouseholdBzjLessThan(BigDecimal value) {
            addCriterion("household_bzj <", value, "householdBzj");
            return (Criteria) this;
        }

        public Criteria andHouseholdBzjLessThanOrEqualTo(BigDecimal value) {
            addCriterion("household_bzj <=", value, "householdBzj");
            return (Criteria) this;
        }

        public Criteria andHouseholdBzjIn(List<BigDecimal> values) {
            addCriterion("household_bzj in", values, "householdBzj");
            return (Criteria) this;
        }

        public Criteria andHouseholdBzjNotIn(List<BigDecimal> values) {
            addCriterion("household_bzj not in", values, "householdBzj");
            return (Criteria) this;
        }

        public Criteria andHouseholdBzjBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("household_bzj between", value1, value2, "householdBzj");
            return (Criteria) this;
        }

        public Criteria andHouseholdBzjNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("household_bzj not between", value1, value2, "householdBzj");
            return (Criteria) this;
        }

        public Criteria andHouseholdLctjlIsNull() {
            addCriterion("household_lctjl is null");
            return (Criteria) this;
        }

        public Criteria andHouseholdLctjlIsNotNull() {
            addCriterion("household_lctjl is not null");
            return (Criteria) this;
        }

        public Criteria andHouseholdLctjlEqualTo(BigDecimal value) {
            addCriterion("household_lctjl =", value, "householdLctjl");
            return (Criteria) this;
        }

        public Criteria andHouseholdLctjlNotEqualTo(BigDecimal value) {
            addCriterion("household_lctjl <>", value, "householdLctjl");
            return (Criteria) this;
        }

        public Criteria andHouseholdLctjlGreaterThan(BigDecimal value) {
            addCriterion("household_lctjl >", value, "householdLctjl");
            return (Criteria) this;
        }

        public Criteria andHouseholdLctjlGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("household_lctjl >=", value, "householdLctjl");
            return (Criteria) this;
        }

        public Criteria andHouseholdLctjlLessThan(BigDecimal value) {
            addCriterion("household_lctjl <", value, "householdLctjl");
            return (Criteria) this;
        }

        public Criteria andHouseholdLctjlLessThanOrEqualTo(BigDecimal value) {
            addCriterion("household_lctjl <=", value, "householdLctjl");
            return (Criteria) this;
        }

        public Criteria andHouseholdLctjlIn(List<BigDecimal> values) {
            addCriterion("household_lctjl in", values, "householdLctjl");
            return (Criteria) this;
        }

        public Criteria andHouseholdLctjlNotIn(List<BigDecimal> values) {
            addCriterion("household_lctjl not in", values, "householdLctjl");
            return (Criteria) this;
        }

        public Criteria andHouseholdLctjlBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("household_lctjl between", value1, value2, "householdLctjl");
            return (Criteria) this;
        }

        public Criteria andHouseholdLctjlNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("household_lctjl not between", value1, value2, "householdLctjl");
            return (Criteria) this;
        }

        public Criteria andHouseholdCxtjlIsNull() {
            addCriterion("household_cxtjl is null");
            return (Criteria) this;
        }

        public Criteria andHouseholdCxtjlIsNotNull() {
            addCriterion("household_cxtjl is not null");
            return (Criteria) this;
        }

        public Criteria andHouseholdCxtjlEqualTo(BigDecimal value) {
            addCriterion("household_cxtjl =", value, "householdCxtjl");
            return (Criteria) this;
        }

        public Criteria andHouseholdCxtjlNotEqualTo(BigDecimal value) {
            addCriterion("household_cxtjl <>", value, "householdCxtjl");
            return (Criteria) this;
        }

        public Criteria andHouseholdCxtjlGreaterThan(BigDecimal value) {
            addCriterion("household_cxtjl >", value, "householdCxtjl");
            return (Criteria) this;
        }

        public Criteria andHouseholdCxtjlGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("household_cxtjl >=", value, "householdCxtjl");
            return (Criteria) this;
        }

        public Criteria andHouseholdCxtjlLessThan(BigDecimal value) {
            addCriterion("household_cxtjl <", value, "householdCxtjl");
            return (Criteria) this;
        }

        public Criteria andHouseholdCxtjlLessThanOrEqualTo(BigDecimal value) {
            addCriterion("household_cxtjl <=", value, "householdCxtjl");
            return (Criteria) this;
        }

        public Criteria andHouseholdCxtjlIn(List<BigDecimal> values) {
            addCriterion("household_cxtjl in", values, "householdCxtjl");
            return (Criteria) this;
        }

        public Criteria andHouseholdCxtjlNotIn(List<BigDecimal> values) {
            addCriterion("household_cxtjl not in", values, "householdCxtjl");
            return (Criteria) this;
        }

        public Criteria andHouseholdCxtjlBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("household_cxtjl between", value1, value2, "householdCxtjl");
            return (Criteria) this;
        }

        public Criteria andHouseholdCxtjlNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("household_cxtjl not between", value1, value2, "householdCxtjl");
            return (Criteria) this;
        }

        public Criteria andHouseholdGntjlIsNull() {
            addCriterion("household_gntjl is null");
            return (Criteria) this;
        }

        public Criteria andHouseholdGntjlIsNotNull() {
            addCriterion("household_gntjl is not null");
            return (Criteria) this;
        }

        public Criteria andHouseholdGntjlEqualTo(BigDecimal value) {
            addCriterion("household_gntjl =", value, "householdGntjl");
            return (Criteria) this;
        }

        public Criteria andHouseholdGntjlNotEqualTo(BigDecimal value) {
            addCriterion("household_gntjl <>", value, "householdGntjl");
            return (Criteria) this;
        }

        public Criteria andHouseholdGntjlGreaterThan(BigDecimal value) {
            addCriterion("household_gntjl >", value, "householdGntjl");
            return (Criteria) this;
        }

        public Criteria andHouseholdGntjlGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("household_gntjl >=", value, "householdGntjl");
            return (Criteria) this;
        }

        public Criteria andHouseholdGntjlLessThan(BigDecimal value) {
            addCriterion("household_gntjl <", value, "householdGntjl");
            return (Criteria) this;
        }

        public Criteria andHouseholdGntjlLessThanOrEqualTo(BigDecimal value) {
            addCriterion("household_gntjl <=", value, "householdGntjl");
            return (Criteria) this;
        }

        public Criteria andHouseholdGntjlIn(List<BigDecimal> values) {
            addCriterion("household_gntjl in", values, "householdGntjl");
            return (Criteria) this;
        }

        public Criteria andHouseholdGntjlNotIn(List<BigDecimal> values) {
            addCriterion("household_gntjl not in", values, "householdGntjl");
            return (Criteria) this;
        }

        public Criteria andHouseholdGntjlBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("household_gntjl between", value1, value2, "householdGntjl");
            return (Criteria) this;
        }

        public Criteria andHouseholdGntjlNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("household_gntjl not between", value1, value2, "householdGntjl");
            return (Criteria) this;
        }

        public Criteria andHouseholdDdtjlIsNull() {
            addCriterion("household_ddtjl is null");
            return (Criteria) this;
        }

        public Criteria andHouseholdDdtjlIsNotNull() {
            addCriterion("household_ddtjl is not null");
            return (Criteria) this;
        }

        public Criteria andHouseholdDdtjlEqualTo(BigDecimal value) {
            addCriterion("household_ddtjl =", value, "householdDdtjl");
            return (Criteria) this;
        }

        public Criteria andHouseholdDdtjlNotEqualTo(BigDecimal value) {
            addCriterion("household_ddtjl <>", value, "householdDdtjl");
            return (Criteria) this;
        }

        public Criteria andHouseholdDdtjlGreaterThan(BigDecimal value) {
            addCriterion("household_ddtjl >", value, "householdDdtjl");
            return (Criteria) this;
        }

        public Criteria andHouseholdDdtjlGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("household_ddtjl >=", value, "householdDdtjl");
            return (Criteria) this;
        }

        public Criteria andHouseholdDdtjlLessThan(BigDecimal value) {
            addCriterion("household_ddtjl <", value, "householdDdtjl");
            return (Criteria) this;
        }

        public Criteria andHouseholdDdtjlLessThanOrEqualTo(BigDecimal value) {
            addCriterion("household_ddtjl <=", value, "householdDdtjl");
            return (Criteria) this;
        }

        public Criteria andHouseholdDdtjlIn(List<BigDecimal> values) {
            addCriterion("household_ddtjl in", values, "householdDdtjl");
            return (Criteria) this;
        }

        public Criteria andHouseholdDdtjlNotIn(List<BigDecimal> values) {
            addCriterion("household_ddtjl not in", values, "householdDdtjl");
            return (Criteria) this;
        }

        public Criteria andHouseholdDdtjlBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("household_ddtjl between", value1, value2, "householdDdtjl");
            return (Criteria) this;
        }

        public Criteria andHouseholdDdtjlNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("household_ddtjl not between", value1, value2, "householdDdtjl");
            return (Criteria) this;
        }

        public Criteria andHouseholdZjbzIsNull() {
            addCriterion("household_zjbz is null");
            return (Criteria) this;
        }

        public Criteria andHouseholdZjbzIsNotNull() {
            addCriterion("household_zjbz is not null");
            return (Criteria) this;
        }

        public Criteria andHouseholdZjbzEqualTo(String value) {
            addCriterion("household_zjbz =", value, "householdZjbz");
            return (Criteria) this;
        }

        public Criteria andHouseholdZjbzNotEqualTo(String value) {
            addCriterion("household_zjbz <>", value, "householdZjbz");
            return (Criteria) this;
        }

        public Criteria andHouseholdZjbzGreaterThan(String value) {
            addCriterion("household_zjbz >", value, "householdZjbz");
            return (Criteria) this;
        }

        public Criteria andHouseholdZjbzGreaterThanOrEqualTo(String value) {
            addCriterion("household_zjbz >=", value, "householdZjbz");
            return (Criteria) this;
        }

        public Criteria andHouseholdZjbzLessThan(String value) {
            addCriterion("household_zjbz <", value, "householdZjbz");
            return (Criteria) this;
        }

        public Criteria andHouseholdZjbzLessThanOrEqualTo(String value) {
            addCriterion("household_zjbz <=", value, "householdZjbz");
            return (Criteria) this;
        }

        public Criteria andHouseholdZjbzLike(String value) {
            addCriterion("household_zjbz like", value, "householdZjbz");
            return (Criteria) this;
        }

        public Criteria andHouseholdZjbzNotLike(String value) {
            addCriterion("household_zjbz not like", value, "householdZjbz");
            return (Criteria) this;
        }

        public Criteria andHouseholdZjbzIn(List<String> values) {
            addCriterion("household_zjbz in", values, "householdZjbz");
            return (Criteria) this;
        }

        public Criteria andHouseholdZjbzNotIn(List<String> values) {
            addCriterion("household_zjbz not in", values, "householdZjbz");
            return (Criteria) this;
        }

        public Criteria andHouseholdZjbzBetween(String value1, String value2) {
            addCriterion("household_zjbz between", value1, value2, "householdZjbz");
            return (Criteria) this;
        }

        public Criteria andHouseholdZjbzNotBetween(String value1, String value2) {
            addCriterion("household_zjbz not between", value1, value2, "householdZjbz");
            return (Criteria) this;
        }

        public Criteria andHouseholdZcIsNull() {
            addCriterion("household_zc is null");
            return (Criteria) this;
        }

        public Criteria andHouseholdZcIsNotNull() {
            addCriterion("household_zc is not null");
            return (Criteria) this;
        }

        public Criteria andHouseholdZcEqualTo(String value) {
            addCriterion("household_zc =", value, "householdZc");
            return (Criteria) this;
        }

        public Criteria andHouseholdZcNotEqualTo(String value) {
            addCriterion("household_zc <>", value, "householdZc");
            return (Criteria) this;
        }

        public Criteria andHouseholdZcGreaterThan(String value) {
            addCriterion("household_zc >", value, "householdZc");
            return (Criteria) this;
        }

        public Criteria andHouseholdZcGreaterThanOrEqualTo(String value) {
            addCriterion("household_zc >=", value, "householdZc");
            return (Criteria) this;
        }

        public Criteria andHouseholdZcLessThan(String value) {
            addCriterion("household_zc <", value, "householdZc");
            return (Criteria) this;
        }

        public Criteria andHouseholdZcLessThanOrEqualTo(String value) {
            addCriterion("household_zc <=", value, "householdZc");
            return (Criteria) this;
        }

        public Criteria andHouseholdZcLike(String value) {
            addCriterion("household_zc like", value, "householdZc");
            return (Criteria) this;
        }

        public Criteria andHouseholdZcNotLike(String value) {
            addCriterion("household_zc not like", value, "householdZc");
            return (Criteria) this;
        }

        public Criteria andHouseholdZcIn(List<String> values) {
            addCriterion("household_zc in", values, "householdZc");
            return (Criteria) this;
        }

        public Criteria andHouseholdZcNotIn(List<String> values) {
            addCriterion("household_zc not in", values, "householdZc");
            return (Criteria) this;
        }

        public Criteria andHouseholdZcBetween(String value1, String value2) {
            addCriterion("household_zc between", value1, value2, "householdZc");
            return (Criteria) this;
        }

        public Criteria andHouseholdZcNotBetween(String value1, String value2) {
            addCriterion("household_zc not between", value1, value2, "householdZc");
            return (Criteria) this;
        }

        public Criteria andHouseholdZwIsNull() {
            addCriterion("household_zw is null");
            return (Criteria) this;
        }

        public Criteria andHouseholdZwIsNotNull() {
            addCriterion("household_zw is not null");
            return (Criteria) this;
        }

        public Criteria andHouseholdZwEqualTo(String value) {
            addCriterion("household_zw =", value, "householdZw");
            return (Criteria) this;
        }

        public Criteria andHouseholdZwNotEqualTo(String value) {
            addCriterion("household_zw <>", value, "householdZw");
            return (Criteria) this;
        }

        public Criteria andHouseholdZwGreaterThan(String value) {
            addCriterion("household_zw >", value, "householdZw");
            return (Criteria) this;
        }

        public Criteria andHouseholdZwGreaterThanOrEqualTo(String value) {
            addCriterion("household_zw >=", value, "householdZw");
            return (Criteria) this;
        }

        public Criteria andHouseholdZwLessThan(String value) {
            addCriterion("household_zw <", value, "householdZw");
            return (Criteria) this;
        }

        public Criteria andHouseholdZwLessThanOrEqualTo(String value) {
            addCriterion("household_zw <=", value, "householdZw");
            return (Criteria) this;
        }

        public Criteria andHouseholdZwLike(String value) {
            addCriterion("household_zw like", value, "householdZw");
            return (Criteria) this;
        }

        public Criteria andHouseholdZwNotLike(String value) {
            addCriterion("household_zw not like", value, "householdZw");
            return (Criteria) this;
        }

        public Criteria andHouseholdZwIn(List<String> values) {
            addCriterion("household_zw in", values, "householdZw");
            return (Criteria) this;
        }

        public Criteria andHouseholdZwNotIn(List<String> values) {
            addCriterion("household_zw not in", values, "householdZw");
            return (Criteria) this;
        }

        public Criteria andHouseholdZwBetween(String value1, String value2) {
            addCriterion("household_zw between", value1, value2, "householdZw");
            return (Criteria) this;
        }

        public Criteria andHouseholdZwNotBetween(String value1, String value2) {
            addCriterion("household_zw not between", value1, value2, "householdZw");
            return (Criteria) this;
        }

        public Criteria andHouseholdTzsjIsNull() {
            addCriterion("household_tzsj is null");
            return (Criteria) this;
        }

        public Criteria andHouseholdTzsjIsNotNull() {
            addCriterion("household_tzsj is not null");
            return (Criteria) this;
        }

        public Criteria andHouseholdTzsjEqualTo(Date value) {
            addCriterion("household_tzsj =", value, "householdTzsj");
            return (Criteria) this;
        }

        public Criteria andHouseholdTzsjNotEqualTo(Date value) {
            addCriterion("household_tzsj <>", value, "householdTzsj");
            return (Criteria) this;
        }

        public Criteria andHouseholdTzsjGreaterThan(Date value) {
            addCriterion("household_tzsj >", value, "householdTzsj");
            return (Criteria) this;
        }

        public Criteria andHouseholdTzsjGreaterThanOrEqualTo(Date value) {
            addCriterion("household_tzsj >=", value, "householdTzsj");
            return (Criteria) this;
        }

        public Criteria andHouseholdTzsjLessThan(Date value) {
            addCriterion("household_tzsj <", value, "householdTzsj");
            return (Criteria) this;
        }

        public Criteria andHouseholdTzsjLessThanOrEqualTo(Date value) {
            addCriterion("household_tzsj <=", value, "householdTzsj");
            return (Criteria) this;
        }

        public Criteria andHouseholdTzsjIn(List<Date> values) {
            addCriterion("household_tzsj in", values, "householdTzsj");
            return (Criteria) this;
        }

        public Criteria andHouseholdTzsjNotIn(List<Date> values) {
            addCriterion("household_tzsj not in", values, "householdTzsj");
            return (Criteria) this;
        }

        public Criteria andHouseholdTzsjBetween(Date value1, Date value2) {
            addCriterion("household_tzsj between", value1, value2, "householdTzsj");
            return (Criteria) this;
        }

        public Criteria andHouseholdTzsjNotBetween(Date value1, Date value2) {
            addCriterion("household_tzsj not between", value1, value2, "householdTzsj");
            return (Criteria) this;
        }

        public Criteria andHouseholdSbzjstatIsNull() {
            addCriterion("household_sbzjstat is null");
            return (Criteria) this;
        }

        public Criteria andHouseholdSbzjstatIsNotNull() {
            addCriterion("household_sbzjstat is not null");
            return (Criteria) this;
        }

        public Criteria andHouseholdSbzjstatEqualTo(String value) {
            addCriterion("household_sbzjstat =", value, "householdSbzjstat");
            return (Criteria) this;
        }

        public Criteria andHouseholdSbzjstatNotEqualTo(String value) {
            addCriterion("household_sbzjstat <>", value, "householdSbzjstat");
            return (Criteria) this;
        }

        public Criteria andHouseholdSbzjstatGreaterThan(String value) {
            addCriterion("household_sbzjstat >", value, "householdSbzjstat");
            return (Criteria) this;
        }

        public Criteria andHouseholdSbzjstatGreaterThanOrEqualTo(String value) {
            addCriterion("household_sbzjstat >=", value, "householdSbzjstat");
            return (Criteria) this;
        }

        public Criteria andHouseholdSbzjstatLessThan(String value) {
            addCriterion("household_sbzjstat <", value, "householdSbzjstat");
            return (Criteria) this;
        }

        public Criteria andHouseholdSbzjstatLessThanOrEqualTo(String value) {
            addCriterion("household_sbzjstat <=", value, "householdSbzjstat");
            return (Criteria) this;
        }

        public Criteria andHouseholdSbzjstatLike(String value) {
            addCriterion("household_sbzjstat like", value, "householdSbzjstat");
            return (Criteria) this;
        }

        public Criteria andHouseholdSbzjstatNotLike(String value) {
            addCriterion("household_sbzjstat not like", value, "householdSbzjstat");
            return (Criteria) this;
        }

        public Criteria andHouseholdSbzjstatIn(List<String> values) {
            addCriterion("household_sbzjstat in", values, "householdSbzjstat");
            return (Criteria) this;
        }

        public Criteria andHouseholdSbzjstatNotIn(List<String> values) {
            addCriterion("household_sbzjstat not in", values, "householdSbzjstat");
            return (Criteria) this;
        }

        public Criteria andHouseholdSbzjstatBetween(String value1, String value2) {
            addCriterion("household_sbzjstat between", value1, value2, "householdSbzjstat");
            return (Criteria) this;
        }

        public Criteria andHouseholdSbzjstatNotBetween(String value1, String value2) {
            addCriterion("household_sbzjstat not between", value1, value2, "householdSbzjstat");
            return (Criteria) this;
        }

        public Criteria andHouseholdIfytkIsNull() {
            addCriterion("household_ifytk is null");
            return (Criteria) this;
        }

        public Criteria andHouseholdIfytkIsNotNull() {
            addCriterion("household_ifytk is not null");
            return (Criteria) this;
        }

        public Criteria andHouseholdIfytkEqualTo(String value) {
            addCriterion("household_ifytk =", value, "householdIfytk");
            return (Criteria) this;
        }

        public Criteria andHouseholdIfytkNotEqualTo(String value) {
            addCriterion("household_ifytk <>", value, "householdIfytk");
            return (Criteria) this;
        }

        public Criteria andHouseholdIfytkGreaterThan(String value) {
            addCriterion("household_ifytk >", value, "householdIfytk");
            return (Criteria) this;
        }

        public Criteria andHouseholdIfytkGreaterThanOrEqualTo(String value) {
            addCriterion("household_ifytk >=", value, "householdIfytk");
            return (Criteria) this;
        }

        public Criteria andHouseholdIfytkLessThan(String value) {
            addCriterion("household_ifytk <", value, "householdIfytk");
            return (Criteria) this;
        }

        public Criteria andHouseholdIfytkLessThanOrEqualTo(String value) {
            addCriterion("household_ifytk <=", value, "householdIfytk");
            return (Criteria) this;
        }

        public Criteria andHouseholdIfytkLike(String value) {
            addCriterion("household_ifytk like", value, "householdIfytk");
            return (Criteria) this;
        }

        public Criteria andHouseholdIfytkNotLike(String value) {
            addCriterion("household_ifytk not like", value, "householdIfytk");
            return (Criteria) this;
        }

        public Criteria andHouseholdIfytkIn(List<String> values) {
            addCriterion("household_ifytk in", values, "householdIfytk");
            return (Criteria) this;
        }

        public Criteria andHouseholdIfytkNotIn(List<String> values) {
            addCriterion("household_ifytk not in", values, "householdIfytk");
            return (Criteria) this;
        }

        public Criteria andHouseholdIfytkBetween(String value1, String value2) {
            addCriterion("household_ifytk between", value1, value2, "householdIfytk");
            return (Criteria) this;
        }

        public Criteria andHouseholdIfytkNotBetween(String value1, String value2) {
            addCriterion("household_ifytk not between", value1, value2, "householdIfytk");
            return (Criteria) this;
        }

        public Criteria andHouseholdYtkmemoIsNull() {
            addCriterion("household_ytkmemo is null");
            return (Criteria) this;
        }

        public Criteria andHouseholdYtkmemoIsNotNull() {
            addCriterion("household_ytkmemo is not null");
            return (Criteria) this;
        }

        public Criteria andHouseholdYtkmemoEqualTo(String value) {
            addCriterion("household_ytkmemo =", value, "householdYtkmemo");
            return (Criteria) this;
        }

        public Criteria andHouseholdYtkmemoNotEqualTo(String value) {
            addCriterion("household_ytkmemo <>", value, "householdYtkmemo");
            return (Criteria) this;
        }

        public Criteria andHouseholdYtkmemoGreaterThan(String value) {
            addCriterion("household_ytkmemo >", value, "householdYtkmemo");
            return (Criteria) this;
        }

        public Criteria andHouseholdYtkmemoGreaterThanOrEqualTo(String value) {
            addCriterion("household_ytkmemo >=", value, "householdYtkmemo");
            return (Criteria) this;
        }

        public Criteria andHouseholdYtkmemoLessThan(String value) {
            addCriterion("household_ytkmemo <", value, "householdYtkmemo");
            return (Criteria) this;
        }

        public Criteria andHouseholdYtkmemoLessThanOrEqualTo(String value) {
            addCriterion("household_ytkmemo <=", value, "householdYtkmemo");
            return (Criteria) this;
        }

        public Criteria andHouseholdYtkmemoLike(String value) {
            addCriterion("household_ytkmemo like", value, "householdYtkmemo");
            return (Criteria) this;
        }

        public Criteria andHouseholdYtkmemoNotLike(String value) {
            addCriterion("household_ytkmemo not like", value, "householdYtkmemo");
            return (Criteria) this;
        }

        public Criteria andHouseholdYtkmemoIn(List<String> values) {
            addCriterion("household_ytkmemo in", values, "householdYtkmemo");
            return (Criteria) this;
        }

        public Criteria andHouseholdYtkmemoNotIn(List<String> values) {
            addCriterion("household_ytkmemo not in", values, "householdYtkmemo");
            return (Criteria) this;
        }

        public Criteria andHouseholdYtkmemoBetween(String value1, String value2) {
            addCriterion("household_ytkmemo between", value1, value2, "householdYtkmemo");
            return (Criteria) this;
        }

        public Criteria andHouseholdYtkmemoNotBetween(String value1, String value2) {
            addCriterion("household_ytkmemo not between", value1, value2, "householdYtkmemo");
            return (Criteria) this;
        }

        public Criteria andHouseholdTfkindIsNull() {
            addCriterion("household_tfkind is null");
            return (Criteria) this;
        }

        public Criteria andHouseholdTfkindIsNotNull() {
            addCriterion("household_tfkind is not null");
            return (Criteria) this;
        }

        public Criteria andHouseholdTfkindEqualTo(String value) {
            addCriterion("household_tfkind =", value, "householdTfkind");
            return (Criteria) this;
        }

        public Criteria andHouseholdTfkindNotEqualTo(String value) {
            addCriterion("household_tfkind <>", value, "householdTfkind");
            return (Criteria) this;
        }

        public Criteria andHouseholdTfkindGreaterThan(String value) {
            addCriterion("household_tfkind >", value, "householdTfkind");
            return (Criteria) this;
        }

        public Criteria andHouseholdTfkindGreaterThanOrEqualTo(String value) {
            addCriterion("household_tfkind >=", value, "householdTfkind");
            return (Criteria) this;
        }

        public Criteria andHouseholdTfkindLessThan(String value) {
            addCriterion("household_tfkind <", value, "householdTfkind");
            return (Criteria) this;
        }

        public Criteria andHouseholdTfkindLessThanOrEqualTo(String value) {
            addCriterion("household_tfkind <=", value, "householdTfkind");
            return (Criteria) this;
        }

        public Criteria andHouseholdTfkindLike(String value) {
            addCriterion("household_tfkind like", value, "householdTfkind");
            return (Criteria) this;
        }

        public Criteria andHouseholdTfkindNotLike(String value) {
            addCriterion("household_tfkind not like", value, "householdTfkind");
            return (Criteria) this;
        }

        public Criteria andHouseholdTfkindIn(List<String> values) {
            addCriterion("household_tfkind in", values, "householdTfkind");
            return (Criteria) this;
        }

        public Criteria andHouseholdTfkindNotIn(List<String> values) {
            addCriterion("household_tfkind not in", values, "householdTfkind");
            return (Criteria) this;
        }

        public Criteria andHouseholdTfkindBetween(String value1, String value2) {
            addCriterion("household_tfkind between", value1, value2, "householdTfkind");
            return (Criteria) this;
        }

        public Criteria andHouseholdTfkindNotBetween(String value1, String value2) {
            addCriterion("household_tfkind not between", value1, value2, "householdTfkind");
            return (Criteria) this;
        }

        public Criteria andHouseholdTfreasonIsNull() {
            addCriterion("household_tfreason is null");
            return (Criteria) this;
        }

        public Criteria andHouseholdTfreasonIsNotNull() {
            addCriterion("household_tfreason is not null");
            return (Criteria) this;
        }

        public Criteria andHouseholdTfreasonEqualTo(String value) {
            addCriterion("household_tfreason =", value, "householdTfreason");
            return (Criteria) this;
        }

        public Criteria andHouseholdTfreasonNotEqualTo(String value) {
            addCriterion("household_tfreason <>", value, "householdTfreason");
            return (Criteria) this;
        }

        public Criteria andHouseholdTfreasonGreaterThan(String value) {
            addCriterion("household_tfreason >", value, "householdTfreason");
            return (Criteria) this;
        }

        public Criteria andHouseholdTfreasonGreaterThanOrEqualTo(String value) {
            addCriterion("household_tfreason >=", value, "householdTfreason");
            return (Criteria) this;
        }

        public Criteria andHouseholdTfreasonLessThan(String value) {
            addCriterion("household_tfreason <", value, "householdTfreason");
            return (Criteria) this;
        }

        public Criteria andHouseholdTfreasonLessThanOrEqualTo(String value) {
            addCriterion("household_tfreason <=", value, "householdTfreason");
            return (Criteria) this;
        }

        public Criteria andHouseholdTfreasonLike(String value) {
            addCriterion("household_tfreason like", value, "householdTfreason");
            return (Criteria) this;
        }

        public Criteria andHouseholdTfreasonNotLike(String value) {
            addCriterion("household_tfreason not like", value, "householdTfreason");
            return (Criteria) this;
        }

        public Criteria andHouseholdTfreasonIn(List<String> values) {
            addCriterion("household_tfreason in", values, "householdTfreason");
            return (Criteria) this;
        }

        public Criteria andHouseholdTfreasonNotIn(List<String> values) {
            addCriterion("household_tfreason not in", values, "householdTfreason");
            return (Criteria) this;
        }

        public Criteria andHouseholdTfreasonBetween(String value1, String value2) {
            addCriterion("household_tfreason between", value1, value2, "householdTfreason");
            return (Criteria) this;
        }

        public Criteria andHouseholdTfreasonNotBetween(String value1, String value2) {
            addCriterion("household_tfreason not between", value1, value2, "householdTfreason");
            return (Criteria) this;
        }

        public Criteria andHouseholdTfdateIsNull() {
            addCriterion("household_tfdate is null");
            return (Criteria) this;
        }

        public Criteria andHouseholdTfdateIsNotNull() {
            addCriterion("household_tfdate is not null");
            return (Criteria) this;
        }

        public Criteria andHouseholdTfdateEqualTo(Date value) {
            addCriterion("household_tfdate =", value, "householdTfdate");
            return (Criteria) this;
        }

        public Criteria andHouseholdTfdateNotEqualTo(Date value) {
            addCriterion("household_tfdate <>", value, "householdTfdate");
            return (Criteria) this;
        }

        public Criteria andHouseholdTfdateGreaterThan(Date value) {
            addCriterion("household_tfdate >", value, "householdTfdate");
            return (Criteria) this;
        }

        public Criteria andHouseholdTfdateGreaterThanOrEqualTo(Date value) {
            addCriterion("household_tfdate >=", value, "householdTfdate");
            return (Criteria) this;
        }

        public Criteria andHouseholdTfdateLessThan(Date value) {
            addCriterion("household_tfdate <", value, "householdTfdate");
            return (Criteria) this;
        }

        public Criteria andHouseholdTfdateLessThanOrEqualTo(Date value) {
            addCriterion("household_tfdate <=", value, "householdTfdate");
            return (Criteria) this;
        }

        public Criteria andHouseholdTfdateIn(List<Date> values) {
            addCriterion("household_tfdate in", values, "householdTfdate");
            return (Criteria) this;
        }

        public Criteria andHouseholdTfdateNotIn(List<Date> values) {
            addCriterion("household_tfdate not in", values, "householdTfdate");
            return (Criteria) this;
        }

        public Criteria andHouseholdTfdateBetween(Date value1, Date value2) {
            addCriterion("household_tfdate between", value1, value2, "householdTfdate");
            return (Criteria) this;
        }

        public Criteria andHouseholdTfdateNotBetween(Date value1, Date value2) {
            addCriterion("household_tfdate not between", value1, value2, "householdTfdate");
            return (Criteria) this;
        }

        public Criteria andHouseholdTfmemoIsNull() {
            addCriterion("household_tfmemo is null");
            return (Criteria) this;
        }

        public Criteria andHouseholdTfmemoIsNotNull() {
            addCriterion("household_tfmemo is not null");
            return (Criteria) this;
        }

        public Criteria andHouseholdTfmemoEqualTo(String value) {
            addCriterion("household_tfmemo =", value, "householdTfmemo");
            return (Criteria) this;
        }

        public Criteria andHouseholdTfmemoNotEqualTo(String value) {
            addCriterion("household_tfmemo <>", value, "householdTfmemo");
            return (Criteria) this;
        }

        public Criteria andHouseholdTfmemoGreaterThan(String value) {
            addCriterion("household_tfmemo >", value, "householdTfmemo");
            return (Criteria) this;
        }

        public Criteria andHouseholdTfmemoGreaterThanOrEqualTo(String value) {
            addCriterion("household_tfmemo >=", value, "householdTfmemo");
            return (Criteria) this;
        }

        public Criteria andHouseholdTfmemoLessThan(String value) {
            addCriterion("household_tfmemo <", value, "householdTfmemo");
            return (Criteria) this;
        }

        public Criteria andHouseholdTfmemoLessThanOrEqualTo(String value) {
            addCriterion("household_tfmemo <=", value, "householdTfmemo");
            return (Criteria) this;
        }

        public Criteria andHouseholdTfmemoLike(String value) {
            addCriterion("household_tfmemo like", value, "householdTfmemo");
            return (Criteria) this;
        }

        public Criteria andHouseholdTfmemoNotLike(String value) {
            addCriterion("household_tfmemo not like", value, "householdTfmemo");
            return (Criteria) this;
        }

        public Criteria andHouseholdTfmemoIn(List<String> values) {
            addCriterion("household_tfmemo in", values, "householdTfmemo");
            return (Criteria) this;
        }

        public Criteria andHouseholdTfmemoNotIn(List<String> values) {
            addCriterion("household_tfmemo not in", values, "householdTfmemo");
            return (Criteria) this;
        }

        public Criteria andHouseholdTfmemoBetween(String value1, String value2) {
            addCriterion("household_tfmemo between", value1, value2, "householdTfmemo");
            return (Criteria) this;
        }

        public Criteria andHouseholdTfmemoNotBetween(String value1, String value2) {
            addCriterion("household_tfmemo not between", value1, value2, "householdTfmemo");
            return (Criteria) this;
        }

        public Criteria andHouseholdNewserialIsNull() {
            addCriterion("household_newserial is null");
            return (Criteria) this;
        }

        public Criteria andHouseholdNewserialIsNotNull() {
            addCriterion("household_newserial is not null");
            return (Criteria) this;
        }

        public Criteria andHouseholdNewserialEqualTo(String value) {
            addCriterion("household_newserial =", value, "householdNewserial");
            return (Criteria) this;
        }

        public Criteria andHouseholdNewserialNotEqualTo(String value) {
            addCriterion("household_newserial <>", value, "householdNewserial");
            return (Criteria) this;
        }

        public Criteria andHouseholdNewserialGreaterThan(String value) {
            addCriterion("household_newserial >", value, "householdNewserial");
            return (Criteria) this;
        }

        public Criteria andHouseholdNewserialGreaterThanOrEqualTo(String value) {
            addCriterion("household_newserial >=", value, "householdNewserial");
            return (Criteria) this;
        }

        public Criteria andHouseholdNewserialLessThan(String value) {
            addCriterion("household_newserial <", value, "householdNewserial");
            return (Criteria) this;
        }

        public Criteria andHouseholdNewserialLessThanOrEqualTo(String value) {
            addCriterion("household_newserial <=", value, "householdNewserial");
            return (Criteria) this;
        }

        public Criteria andHouseholdNewserialLike(String value) {
            addCriterion("household_newserial like", value, "householdNewserial");
            return (Criteria) this;
        }

        public Criteria andHouseholdNewserialNotLike(String value) {
            addCriterion("household_newserial not like", value, "householdNewserial");
            return (Criteria) this;
        }

        public Criteria andHouseholdNewserialIn(List<String> values) {
            addCriterion("household_newserial in", values, "householdNewserial");
            return (Criteria) this;
        }

        public Criteria andHouseholdNewserialNotIn(List<String> values) {
            addCriterion("household_newserial not in", values, "householdNewserial");
            return (Criteria) this;
        }

        public Criteria andHouseholdNewserialBetween(String value1, String value2) {
            addCriterion("household_newserial between", value1, value2, "householdNewserial");
            return (Criteria) this;
        }

        public Criteria andHouseholdNewserialNotBetween(String value1, String value2) {
            addCriterion("household_newserial not between", value1, value2, "householdNewserial");
            return (Criteria) this;
        }

        public Criteria andHouseholdGhdateIsNull() {
            addCriterion("household_ghdate is null");
            return (Criteria) this;
        }

        public Criteria andHouseholdGhdateIsNotNull() {
            addCriterion("household_ghdate is not null");
            return (Criteria) this;
        }

        public Criteria andHouseholdGhdateEqualTo(Date value) {
            addCriterion("household_ghdate =", value, "householdGhdate");
            return (Criteria) this;
        }

        public Criteria andHouseholdGhdateNotEqualTo(Date value) {
            addCriterion("household_ghdate <>", value, "householdGhdate");
            return (Criteria) this;
        }

        public Criteria andHouseholdGhdateGreaterThan(Date value) {
            addCriterion("household_ghdate >", value, "householdGhdate");
            return (Criteria) this;
        }

        public Criteria andHouseholdGhdateGreaterThanOrEqualTo(Date value) {
            addCriterion("household_ghdate >=", value, "householdGhdate");
            return (Criteria) this;
        }

        public Criteria andHouseholdGhdateLessThan(Date value) {
            addCriterion("household_ghdate <", value, "householdGhdate");
            return (Criteria) this;
        }

        public Criteria andHouseholdGhdateLessThanOrEqualTo(Date value) {
            addCriterion("household_ghdate <=", value, "householdGhdate");
            return (Criteria) this;
        }

        public Criteria andHouseholdGhdateIn(List<Date> values) {
            addCriterion("household_ghdate in", values, "householdGhdate");
            return (Criteria) this;
        }

        public Criteria andHouseholdGhdateNotIn(List<Date> values) {
            addCriterion("household_ghdate not in", values, "householdGhdate");
            return (Criteria) this;
        }

        public Criteria andHouseholdGhdateBetween(Date value1, Date value2) {
            addCriterion("household_ghdate between", value1, value2, "householdGhdate");
            return (Criteria) this;
        }

        public Criteria andHouseholdGhdateNotBetween(Date value1, Date value2) {
            addCriterion("household_ghdate not between", value1, value2, "householdGhdate");
            return (Criteria) this;
        }

        public Criteria andHouseholdGhreasonIsNull() {
            addCriterion("household_ghreason is null");
            return (Criteria) this;
        }

        public Criteria andHouseholdGhreasonIsNotNull() {
            addCriterion("household_ghreason is not null");
            return (Criteria) this;
        }

        public Criteria andHouseholdGhreasonEqualTo(String value) {
            addCriterion("household_ghreason =", value, "householdGhreason");
            return (Criteria) this;
        }

        public Criteria andHouseholdGhreasonNotEqualTo(String value) {
            addCriterion("household_ghreason <>", value, "householdGhreason");
            return (Criteria) this;
        }

        public Criteria andHouseholdGhreasonGreaterThan(String value) {
            addCriterion("household_ghreason >", value, "householdGhreason");
            return (Criteria) this;
        }

        public Criteria andHouseholdGhreasonGreaterThanOrEqualTo(String value) {
            addCriterion("household_ghreason >=", value, "householdGhreason");
            return (Criteria) this;
        }

        public Criteria andHouseholdGhreasonLessThan(String value) {
            addCriterion("household_ghreason <", value, "householdGhreason");
            return (Criteria) this;
        }

        public Criteria andHouseholdGhreasonLessThanOrEqualTo(String value) {
            addCriterion("household_ghreason <=", value, "householdGhreason");
            return (Criteria) this;
        }

        public Criteria andHouseholdGhreasonLike(String value) {
            addCriterion("household_ghreason like", value, "householdGhreason");
            return (Criteria) this;
        }

        public Criteria andHouseholdGhreasonNotLike(String value) {
            addCriterion("household_ghreason not like", value, "householdGhreason");
            return (Criteria) this;
        }

        public Criteria andHouseholdGhreasonIn(List<String> values) {
            addCriterion("household_ghreason in", values, "householdGhreason");
            return (Criteria) this;
        }

        public Criteria andHouseholdGhreasonNotIn(List<String> values) {
            addCriterion("household_ghreason not in", values, "householdGhreason");
            return (Criteria) this;
        }

        public Criteria andHouseholdGhreasonBetween(String value1, String value2) {
            addCriterion("household_ghreason between", value1, value2, "householdGhreason");
            return (Criteria) this;
        }

        public Criteria andHouseholdGhreasonNotBetween(String value1, String value2) {
            addCriterion("household_ghreason not between", value1, value2, "householdGhreason");
            return (Criteria) this;
        }

        public Criteria andHouseholdGhmemoIsNull() {
            addCriterion("household_ghmemo is null");
            return (Criteria) this;
        }

        public Criteria andHouseholdGhmemoIsNotNull() {
            addCriterion("household_ghmemo is not null");
            return (Criteria) this;
        }

        public Criteria andHouseholdGhmemoEqualTo(String value) {
            addCriterion("household_ghmemo =", value, "householdGhmemo");
            return (Criteria) this;
        }

        public Criteria andHouseholdGhmemoNotEqualTo(String value) {
            addCriterion("household_ghmemo <>", value, "householdGhmemo");
            return (Criteria) this;
        }

        public Criteria andHouseholdGhmemoGreaterThan(String value) {
            addCriterion("household_ghmemo >", value, "householdGhmemo");
            return (Criteria) this;
        }

        public Criteria andHouseholdGhmemoGreaterThanOrEqualTo(String value) {
            addCriterion("household_ghmemo >=", value, "householdGhmemo");
            return (Criteria) this;
        }

        public Criteria andHouseholdGhmemoLessThan(String value) {
            addCriterion("household_ghmemo <", value, "householdGhmemo");
            return (Criteria) this;
        }

        public Criteria andHouseholdGhmemoLessThanOrEqualTo(String value) {
            addCriterion("household_ghmemo <=", value, "householdGhmemo");
            return (Criteria) this;
        }

        public Criteria andHouseholdGhmemoLike(String value) {
            addCriterion("household_ghmemo like", value, "householdGhmemo");
            return (Criteria) this;
        }

        public Criteria andHouseholdGhmemoNotLike(String value) {
            addCriterion("household_ghmemo not like", value, "householdGhmemo");
            return (Criteria) this;
        }

        public Criteria andHouseholdGhmemoIn(List<String> values) {
            addCriterion("household_ghmemo in", values, "householdGhmemo");
            return (Criteria) this;
        }

        public Criteria andHouseholdGhmemoNotIn(List<String> values) {
            addCriterion("household_ghmemo not in", values, "householdGhmemo");
            return (Criteria) this;
        }

        public Criteria andHouseholdGhmemoBetween(String value1, String value2) {
            addCriterion("household_ghmemo between", value1, value2, "householdGhmemo");
            return (Criteria) this;
        }

        public Criteria andHouseholdGhmemoNotBetween(String value1, String value2) {
            addCriterion("household_ghmemo not between", value1, value2, "householdGhmemo");
            return (Criteria) this;
        }

        public Criteria andHouseholdHzghIsNull() {
            addCriterion("household_hzgh is null");
            return (Criteria) this;
        }

        public Criteria andHouseholdHzghIsNotNull() {
            addCriterion("household_hzgh is not null");
            return (Criteria) this;
        }

        public Criteria andHouseholdHzghEqualTo(String value) {
            addCriterion("household_hzgh =", value, "householdHzgh");
            return (Criteria) this;
        }

        public Criteria andHouseholdHzghNotEqualTo(String value) {
            addCriterion("household_hzgh <>", value, "householdHzgh");
            return (Criteria) this;
        }

        public Criteria andHouseholdHzghGreaterThan(String value) {
            addCriterion("household_hzgh >", value, "householdHzgh");
            return (Criteria) this;
        }

        public Criteria andHouseholdHzghGreaterThanOrEqualTo(String value) {
            addCriterion("household_hzgh >=", value, "householdHzgh");
            return (Criteria) this;
        }

        public Criteria andHouseholdHzghLessThan(String value) {
            addCriterion("household_hzgh <", value, "householdHzgh");
            return (Criteria) this;
        }

        public Criteria andHouseholdHzghLessThanOrEqualTo(String value) {
            addCriterion("household_hzgh <=", value, "householdHzgh");
            return (Criteria) this;
        }

        public Criteria andHouseholdHzghLike(String value) {
            addCriterion("household_hzgh like", value, "householdHzgh");
            return (Criteria) this;
        }

        public Criteria andHouseholdHzghNotLike(String value) {
            addCriterion("household_hzgh not like", value, "householdHzgh");
            return (Criteria) this;
        }

        public Criteria andHouseholdHzghIn(List<String> values) {
            addCriterion("household_hzgh in", values, "householdHzgh");
            return (Criteria) this;
        }

        public Criteria andHouseholdHzghNotIn(List<String> values) {
            addCriterion("household_hzgh not in", values, "householdHzgh");
            return (Criteria) this;
        }

        public Criteria andHouseholdHzghBetween(String value1, String value2) {
            addCriterion("household_hzgh between", value1, value2, "householdHzgh");
            return (Criteria) this;
        }

        public Criteria andHouseholdHzghNotBetween(String value1, String value2) {
            addCriterion("household_hzgh not between", value1, value2, "householdHzgh");
            return (Criteria) this;
        }

        public Criteria andHouseholdGfjkstatIsNull() {
            addCriterion("household_gfjkstat is null");
            return (Criteria) this;
        }

        public Criteria andHouseholdGfjkstatIsNotNull() {
            addCriterion("household_gfjkstat is not null");
            return (Criteria) this;
        }

        public Criteria andHouseholdGfjkstatEqualTo(String value) {
            addCriterion("household_gfjkstat =", value, "householdGfjkstat");
            return (Criteria) this;
        }

        public Criteria andHouseholdGfjkstatNotEqualTo(String value) {
            addCriterion("household_gfjkstat <>", value, "householdGfjkstat");
            return (Criteria) this;
        }

        public Criteria andHouseholdGfjkstatGreaterThan(String value) {
            addCriterion("household_gfjkstat >", value, "householdGfjkstat");
            return (Criteria) this;
        }

        public Criteria andHouseholdGfjkstatGreaterThanOrEqualTo(String value) {
            addCriterion("household_gfjkstat >=", value, "householdGfjkstat");
            return (Criteria) this;
        }

        public Criteria andHouseholdGfjkstatLessThan(String value) {
            addCriterion("household_gfjkstat <", value, "householdGfjkstat");
            return (Criteria) this;
        }

        public Criteria andHouseholdGfjkstatLessThanOrEqualTo(String value) {
            addCriterion("household_gfjkstat <=", value, "householdGfjkstat");
            return (Criteria) this;
        }

        public Criteria andHouseholdGfjkstatLike(String value) {
            addCriterion("household_gfjkstat like", value, "householdGfjkstat");
            return (Criteria) this;
        }

        public Criteria andHouseholdGfjkstatNotLike(String value) {
            addCriterion("household_gfjkstat not like", value, "householdGfjkstat");
            return (Criteria) this;
        }

        public Criteria andHouseholdGfjkstatIn(List<String> values) {
            addCriterion("household_gfjkstat in", values, "householdGfjkstat");
            return (Criteria) this;
        }

        public Criteria andHouseholdGfjkstatNotIn(List<String> values) {
            addCriterion("household_gfjkstat not in", values, "householdGfjkstat");
            return (Criteria) this;
        }

        public Criteria andHouseholdGfjkstatBetween(String value1, String value2) {
            addCriterion("household_gfjkstat between", value1, value2, "householdGfjkstat");
            return (Criteria) this;
        }

        public Criteria andHouseholdGfjkstatNotBetween(String value1, String value2) {
            addCriterion("household_gfjkstat not between", value1, value2, "householdGfjkstat");
            return (Criteria) this;
        }

        public Criteria andHouseholdYtfdateIsNull() {
            addCriterion("household_ytfdate is null");
            return (Criteria) this;
        }

        public Criteria andHouseholdYtfdateIsNotNull() {
            addCriterion("household_ytfdate is not null");
            return (Criteria) this;
        }

        public Criteria andHouseholdYtfdateEqualTo(Date value) {
            addCriterion("household_ytfdate =", value, "householdYtfdate");
            return (Criteria) this;
        }

        public Criteria andHouseholdYtfdateNotEqualTo(Date value) {
            addCriterion("household_ytfdate <>", value, "householdYtfdate");
            return (Criteria) this;
        }

        public Criteria andHouseholdYtfdateGreaterThan(Date value) {
            addCriterion("household_ytfdate >", value, "householdYtfdate");
            return (Criteria) this;
        }

        public Criteria andHouseholdYtfdateGreaterThanOrEqualTo(Date value) {
            addCriterion("household_ytfdate >=", value, "householdYtfdate");
            return (Criteria) this;
        }

        public Criteria andHouseholdYtfdateLessThan(Date value) {
            addCriterion("household_ytfdate <", value, "householdYtfdate");
            return (Criteria) this;
        }

        public Criteria andHouseholdYtfdateLessThanOrEqualTo(Date value) {
            addCriterion("household_ytfdate <=", value, "householdYtfdate");
            return (Criteria) this;
        }

        public Criteria andHouseholdYtfdateIn(List<Date> values) {
            addCriterion("household_ytfdate in", values, "householdYtfdate");
            return (Criteria) this;
        }

        public Criteria andHouseholdYtfdateNotIn(List<Date> values) {
            addCriterion("household_ytfdate not in", values, "householdYtfdate");
            return (Criteria) this;
        }

        public Criteria andHouseholdYtfdateBetween(Date value1, Date value2) {
            addCriterion("household_ytfdate between", value1, value2, "householdYtfdate");
            return (Criteria) this;
        }

        public Criteria andHouseholdYtfdateNotBetween(Date value1, Date value2) {
            addCriterion("household_ytfdate not between", value1, value2, "householdYtfdate");
            return (Criteria) this;
        }

        public Criteria andHouseholdXzfserialIsNull() {
            addCriterion("household_xzfserial is null");
            return (Criteria) this;
        }

        public Criteria andHouseholdXzfserialIsNotNull() {
            addCriterion("household_xzfserial is not null");
            return (Criteria) this;
        }

        public Criteria andHouseholdXzfserialEqualTo(String value) {
            addCriterion("household_xzfserial =", value, "householdXzfserial");
            return (Criteria) this;
        }

        public Criteria andHouseholdXzfserialNotEqualTo(String value) {
            addCriterion("household_xzfserial <>", value, "householdXzfserial");
            return (Criteria) this;
        }

        public Criteria andHouseholdXzfserialGreaterThan(String value) {
            addCriterion("household_xzfserial >", value, "householdXzfserial");
            return (Criteria) this;
        }

        public Criteria andHouseholdXzfserialGreaterThanOrEqualTo(String value) {
            addCriterion("household_xzfserial >=", value, "householdXzfserial");
            return (Criteria) this;
        }

        public Criteria andHouseholdXzfserialLessThan(String value) {
            addCriterion("household_xzfserial <", value, "householdXzfserial");
            return (Criteria) this;
        }

        public Criteria andHouseholdXzfserialLessThanOrEqualTo(String value) {
            addCriterion("household_xzfserial <=", value, "householdXzfserial");
            return (Criteria) this;
        }

        public Criteria andHouseholdXzfserialLike(String value) {
            addCriterion("household_xzfserial like", value, "householdXzfserial");
            return (Criteria) this;
        }

        public Criteria andHouseholdXzfserialNotLike(String value) {
            addCriterion("household_xzfserial not like", value, "householdXzfserial");
            return (Criteria) this;
        }

        public Criteria andHouseholdXzfserialIn(List<String> values) {
            addCriterion("household_xzfserial in", values, "householdXzfserial");
            return (Criteria) this;
        }

        public Criteria andHouseholdXzfserialNotIn(List<String> values) {
            addCriterion("household_xzfserial not in", values, "householdXzfserial");
            return (Criteria) this;
        }

        public Criteria andHouseholdXzfserialBetween(String value1, String value2) {
            addCriterion("household_xzfserial between", value1, value2, "householdXzfserial");
            return (Criteria) this;
        }

        public Criteria andHouseholdXzfserialNotBetween(String value1, String value2) {
            addCriterion("household_xzfserial not between", value1, value2, "householdXzfserial");
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