package jijian.demo.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CareerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public CareerExample() {
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
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

        public Criteria andPkIdIsNull() {
            addCriterion("pk_id is null");
            return (Criteria) this;
        }

        public Criteria andPkIdIsNotNull() {
            addCriterion("pk_id is not null");
            return (Criteria) this;
        }

        public Criteria andPkIdEqualTo(Long value) {
            addCriterion("pk_id =", value, "pkId");
            return (Criteria) this;
        }

        public Criteria andPkIdNotEqualTo(Long value) {
            addCriterion("pk_id <>", value, "pkId");
            return (Criteria) this;
        }

        public Criteria andPkIdGreaterThan(Long value) {
            addCriterion("pk_id >", value, "pkId");
            return (Criteria) this;
        }

        public Criteria andPkIdGreaterThanOrEqualTo(Long value) {
            addCriterion("pk_id >=", value, "pkId");
            return (Criteria) this;
        }

        public Criteria andPkIdLessThan(Long value) {
            addCriterion("pk_id <", value, "pkId");
            return (Criteria) this;
        }

        public Criteria andPkIdLessThanOrEqualTo(Long value) {
            addCriterion("pk_id <=", value, "pkId");
            return (Criteria) this;
        }

        public Criteria andPkIdIn(List<Long> values) {
            addCriterion("pk_id in", values, "pkId");
            return (Criteria) this;
        }

        public Criteria andPkIdNotIn(List<Long> values) {
            addCriterion("pk_id not in", values, "pkId");
            return (Criteria) this;
        }

        public Criteria andPkIdBetween(Long value1, Long value2) {
            addCriterion("pk_id between", value1, value2, "pkId");
            return (Criteria) this;
        }

        public Criteria andPkIdNotBetween(Long value1, Long value2) {
            addCriterion("pk_id not between", value1, value2, "pkId");
            return (Criteria) this;
        }

        public Criteria andOpenIdIsNull() {
            addCriterion("open_id is null");
            return (Criteria) this;
        }

        public Criteria andOpenIdIsNotNull() {
            addCriterion("open_id is not null");
            return (Criteria) this;
        }

        public Criteria andOpenIdEqualTo(String value) {
            addCriterion("open_id =", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotEqualTo(String value) {
            addCriterion("open_id <>", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdGreaterThan(String value) {
            addCriterion("open_id >", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdGreaterThanOrEqualTo(String value) {
            addCriterion("open_id >=", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdLessThan(String value) {
            addCriterion("open_id <", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdLessThanOrEqualTo(String value) {
            addCriterion("open_id <=", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdLike(String value) {
            addCriterion("open_id like", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotLike(String value) {
            addCriterion("open_id not like", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdIn(List<String> values) {
            addCriterion("open_id in", values, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotIn(List<String> values) {
            addCriterion("open_id not in", values, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdBetween(String value1, String value2) {
            addCriterion("open_id between", value1, value2, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotBetween(String value1, String value2) {
            addCriterion("open_id not between", value1, value2, "openId");
            return (Criteria) this;
        }

        public Criteria andAttackIsNull() {
            addCriterion("attack is null");
            return (Criteria) this;
        }

        public Criteria andAttackIsNotNull() {
            addCriterion("attack is not null");
            return (Criteria) this;
        }

        public Criteria andAttackEqualTo(Integer value) {
            addCriterion("attack =", value, "attack");
            return (Criteria) this;
        }

        public Criteria andAttackNotEqualTo(Integer value) {
            addCriterion("attack <>", value, "attack");
            return (Criteria) this;
        }

        public Criteria andAttackGreaterThan(Integer value) {
            addCriterion("attack >", value, "attack");
            return (Criteria) this;
        }

        public Criteria andAttackGreaterThanOrEqualTo(Integer value) {
            addCriterion("attack >=", value, "attack");
            return (Criteria) this;
        }

        public Criteria andAttackLessThan(Integer value) {
            addCriterion("attack <", value, "attack");
            return (Criteria) this;
        }

        public Criteria andAttackLessThanOrEqualTo(Integer value) {
            addCriterion("attack <=", value, "attack");
            return (Criteria) this;
        }

        public Criteria andAttackIn(List<Integer> values) {
            addCriterion("attack in", values, "attack");
            return (Criteria) this;
        }

        public Criteria andAttackNotIn(List<Integer> values) {
            addCriterion("attack not in", values, "attack");
            return (Criteria) this;
        }

        public Criteria andAttackBetween(Integer value1, Integer value2) {
            addCriterion("attack between", value1, value2, "attack");
            return (Criteria) this;
        }

        public Criteria andAttackNotBetween(Integer value1, Integer value2) {
            addCriterion("attack not between", value1, value2, "attack");
            return (Criteria) this;
        }

        public Criteria andDefendIsNull() {
            addCriterion("defend is null");
            return (Criteria) this;
        }

        public Criteria andDefendIsNotNull() {
            addCriterion("defend is not null");
            return (Criteria) this;
        }

        public Criteria andDefendEqualTo(Integer value) {
            addCriterion("defend =", value, "defend");
            return (Criteria) this;
        }

        public Criteria andDefendNotEqualTo(Integer value) {
            addCriterion("defend <>", value, "defend");
            return (Criteria) this;
        }

        public Criteria andDefendGreaterThan(Integer value) {
            addCriterion("defend >", value, "defend");
            return (Criteria) this;
        }

        public Criteria andDefendGreaterThanOrEqualTo(Integer value) {
            addCriterion("defend >=", value, "defend");
            return (Criteria) this;
        }

        public Criteria andDefendLessThan(Integer value) {
            addCriterion("defend <", value, "defend");
            return (Criteria) this;
        }

        public Criteria andDefendLessThanOrEqualTo(Integer value) {
            addCriterion("defend <=", value, "defend");
            return (Criteria) this;
        }

        public Criteria andDefendIn(List<Integer> values) {
            addCriterion("defend in", values, "defend");
            return (Criteria) this;
        }

        public Criteria andDefendNotIn(List<Integer> values) {
            addCriterion("defend not in", values, "defend");
            return (Criteria) this;
        }

        public Criteria andDefendBetween(Integer value1, Integer value2) {
            addCriterion("defend between", value1, value2, "defend");
            return (Criteria) this;
        }

        public Criteria andDefendNotBetween(Integer value1, Integer value2) {
            addCriterion("defend not between", value1, value2, "defend");
            return (Criteria) this;
        }

        public Criteria andCounterattackIsNull() {
            addCriterion("counterattack is null");
            return (Criteria) this;
        }

        public Criteria andCounterattackIsNotNull() {
            addCriterion("counterattack is not null");
            return (Criteria) this;
        }

        public Criteria andCounterattackEqualTo(Integer value) {
            addCriterion("counterattack =", value, "counterattack");
            return (Criteria) this;
        }

        public Criteria andCounterattackNotEqualTo(Integer value) {
            addCriterion("counterattack <>", value, "counterattack");
            return (Criteria) this;
        }

        public Criteria andCounterattackGreaterThan(Integer value) {
            addCriterion("counterattack >", value, "counterattack");
            return (Criteria) this;
        }

        public Criteria andCounterattackGreaterThanOrEqualTo(Integer value) {
            addCriterion("counterattack >=", value, "counterattack");
            return (Criteria) this;
        }

        public Criteria andCounterattackLessThan(Integer value) {
            addCriterion("counterattack <", value, "counterattack");
            return (Criteria) this;
        }

        public Criteria andCounterattackLessThanOrEqualTo(Integer value) {
            addCriterion("counterattack <=", value, "counterattack");
            return (Criteria) this;
        }

        public Criteria andCounterattackIn(List<Integer> values) {
            addCriterion("counterattack in", values, "counterattack");
            return (Criteria) this;
        }

        public Criteria andCounterattackNotIn(List<Integer> values) {
            addCriterion("counterattack not in", values, "counterattack");
            return (Criteria) this;
        }

        public Criteria andCounterattackBetween(Integer value1, Integer value2) {
            addCriterion("counterattack between", value1, value2, "counterattack");
            return (Criteria) this;
        }

        public Criteria andCounterattackNotBetween(Integer value1, Integer value2) {
            addCriterion("counterattack not between", value1, value2, "counterattack");
            return (Criteria) this;
        }

        public Criteria andVictoryIsNull() {
            addCriterion("victory is null");
            return (Criteria) this;
        }

        public Criteria andVictoryIsNotNull() {
            addCriterion("victory is not null");
            return (Criteria) this;
        }

        public Criteria andVictoryEqualTo(Integer value) {
            addCriterion("victory =", value, "victory");
            return (Criteria) this;
        }

        public Criteria andVictoryNotEqualTo(Integer value) {
            addCriterion("victory <>", value, "victory");
            return (Criteria) this;
        }

        public Criteria andVictoryGreaterThan(Integer value) {
            addCriterion("victory >", value, "victory");
            return (Criteria) this;
        }

        public Criteria andVictoryGreaterThanOrEqualTo(Integer value) {
            addCriterion("victory >=", value, "victory");
            return (Criteria) this;
        }

        public Criteria andVictoryLessThan(Integer value) {
            addCriterion("victory <", value, "victory");
            return (Criteria) this;
        }

        public Criteria andVictoryLessThanOrEqualTo(Integer value) {
            addCriterion("victory <=", value, "victory");
            return (Criteria) this;
        }

        public Criteria andVictoryIn(List<Integer> values) {
            addCriterion("victory in", values, "victory");
            return (Criteria) this;
        }

        public Criteria andVictoryNotIn(List<Integer> values) {
            addCriterion("victory not in", values, "victory");
            return (Criteria) this;
        }

        public Criteria andVictoryBetween(Integer value1, Integer value2) {
            addCriterion("victory between", value1, value2, "victory");
            return (Criteria) this;
        }

        public Criteria andVictoryNotBetween(Integer value1, Integer value2) {
            addCriterion("victory not between", value1, value2, "victory");
            return (Criteria) this;
        }

        public Criteria andTotalIsNull() {
            addCriterion("total is null");
            return (Criteria) this;
        }

        public Criteria andTotalIsNotNull() {
            addCriterion("total is not null");
            return (Criteria) this;
        }

        public Criteria andTotalEqualTo(Integer value) {
            addCriterion("total =", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotEqualTo(Integer value) {
            addCriterion("total <>", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThan(Integer value) {
            addCriterion("total >", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThanOrEqualTo(Integer value) {
            addCriterion("total >=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThan(Integer value) {
            addCriterion("total <", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThanOrEqualTo(Integer value) {
            addCriterion("total <=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalIn(List<Integer> values) {
            addCriterion("total in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotIn(List<Integer> values) {
            addCriterion("total not in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalBetween(Integer value1, Integer value2) {
            addCriterion("total between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotBetween(Integer value1, Integer value2) {
            addCriterion("total not between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNull() {
            addCriterion("gmt_create is null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNotNull() {
            addCriterion("gmt_create is not null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateEqualTo(Date value) {
            addCriterion("gmt_create =", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotEqualTo(Date value) {
            addCriterion("gmt_create <>", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThan(Date value) {
            addCriterion("gmt_create >", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_create >=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThan(Date value) {
            addCriterion("gmt_create <", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThanOrEqualTo(Date value) {
            addCriterion("gmt_create <=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIn(List<Date> values) {
            addCriterion("gmt_create in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotIn(List<Date> values) {
            addCriterion("gmt_create not in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateBetween(Date value1, Date value2) {
            addCriterion("gmt_create between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotBetween(Date value1, Date value2) {
            addCriterion("gmt_create not between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNull() {
            addCriterion("gmt_modified is null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNotNull() {
            addCriterion("gmt_modified is not null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedEqualTo(Date value) {
            addCriterion("gmt_modified =", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotEqualTo(Date value) {
            addCriterion("gmt_modified <>", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThan(Date value) {
            addCriterion("gmt_modified >", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_modified >=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThan(Date value) {
            addCriterion("gmt_modified <", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThanOrEqualTo(Date value) {
            addCriterion("gmt_modified <=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIn(List<Date> values) {
            addCriterion("gmt_modified in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotIn(List<Date> values) {
            addCriterion("gmt_modified not in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedBetween(Date value1, Date value2) {
            addCriterion("gmt_modified between", value1, value2, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotBetween(Date value1, Date value2) {
            addCriterion("gmt_modified not between", value1, value2, "gmtModified");
            return (Criteria) this;
        }
    }

    /**
     */
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