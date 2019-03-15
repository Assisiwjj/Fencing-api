package jijian.demo.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MatchRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public MatchRecordExample() {
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

        public Criteria andRedNameIsNull() {
            addCriterion("red_name is null");
            return (Criteria) this;
        }

        public Criteria andRedNameIsNotNull() {
            addCriterion("red_name is not null");
            return (Criteria) this;
        }

        public Criteria andRedNameEqualTo(String value) {
            addCriterion("red_name =", value, "redName");
            return (Criteria) this;
        }

        public Criteria andRedNameNotEqualTo(String value) {
            addCriterion("red_name <>", value, "redName");
            return (Criteria) this;
        }

        public Criteria andRedNameGreaterThan(String value) {
            addCriterion("red_name >", value, "redName");
            return (Criteria) this;
        }

        public Criteria andRedNameGreaterThanOrEqualTo(String value) {
            addCriterion("red_name >=", value, "redName");
            return (Criteria) this;
        }

        public Criteria andRedNameLessThan(String value) {
            addCriterion("red_name <", value, "redName");
            return (Criteria) this;
        }

        public Criteria andRedNameLessThanOrEqualTo(String value) {
            addCriterion("red_name <=", value, "redName");
            return (Criteria) this;
        }

        public Criteria andRedNameLike(String value) {
            addCriterion("red_name like", value, "redName");
            return (Criteria) this;
        }

        public Criteria andRedNameNotLike(String value) {
            addCriterion("red_name not like", value, "redName");
            return (Criteria) this;
        }

        public Criteria andRedNameIn(List<String> values) {
            addCriterion("red_name in", values, "redName");
            return (Criteria) this;
        }

        public Criteria andRedNameNotIn(List<String> values) {
            addCriterion("red_name not in", values, "redName");
            return (Criteria) this;
        }

        public Criteria andRedNameBetween(String value1, String value2) {
            addCriterion("red_name between", value1, value2, "redName");
            return (Criteria) this;
        }

        public Criteria andRedNameNotBetween(String value1, String value2) {
            addCriterion("red_name not between", value1, value2, "redName");
            return (Criteria) this;
        }

        public Criteria andRedAttackIsNull() {
            addCriterion("red_attack is null");
            return (Criteria) this;
        }

        public Criteria andRedAttackIsNotNull() {
            addCriterion("red_attack is not null");
            return (Criteria) this;
        }

        public Criteria andRedAttackEqualTo(Byte value) {
            addCriterion("red_attack =", value, "redAttack");
            return (Criteria) this;
        }

        public Criteria andRedAttackNotEqualTo(Byte value) {
            addCriterion("red_attack <>", value, "redAttack");
            return (Criteria) this;
        }

        public Criteria andRedAttackGreaterThan(Byte value) {
            addCriterion("red_attack >", value, "redAttack");
            return (Criteria) this;
        }

        public Criteria andRedAttackGreaterThanOrEqualTo(Byte value) {
            addCriterion("red_attack >=", value, "redAttack");
            return (Criteria) this;
        }

        public Criteria andRedAttackLessThan(Byte value) {
            addCriterion("red_attack <", value, "redAttack");
            return (Criteria) this;
        }

        public Criteria andRedAttackLessThanOrEqualTo(Byte value) {
            addCriterion("red_attack <=", value, "redAttack");
            return (Criteria) this;
        }

        public Criteria andRedAttackIn(List<Byte> values) {
            addCriterion("red_attack in", values, "redAttack");
            return (Criteria) this;
        }

        public Criteria andRedAttackNotIn(List<Byte> values) {
            addCriterion("red_attack not in", values, "redAttack");
            return (Criteria) this;
        }

        public Criteria andRedAttackBetween(Byte value1, Byte value2) {
            addCriterion("red_attack between", value1, value2, "redAttack");
            return (Criteria) this;
        }

        public Criteria andRedAttackNotBetween(Byte value1, Byte value2) {
            addCriterion("red_attack not between", value1, value2, "redAttack");
            return (Criteria) this;
        }

        public Criteria andRedDefendIsNull() {
            addCriterion("red_defend is null");
            return (Criteria) this;
        }

        public Criteria andRedDefendIsNotNull() {
            addCriterion("red_defend is not null");
            return (Criteria) this;
        }

        public Criteria andRedDefendEqualTo(Byte value) {
            addCriterion("red_defend =", value, "redDefend");
            return (Criteria) this;
        }

        public Criteria andRedDefendNotEqualTo(Byte value) {
            addCriterion("red_defend <>", value, "redDefend");
            return (Criteria) this;
        }

        public Criteria andRedDefendGreaterThan(Byte value) {
            addCriterion("red_defend >", value, "redDefend");
            return (Criteria) this;
        }

        public Criteria andRedDefendGreaterThanOrEqualTo(Byte value) {
            addCriterion("red_defend >=", value, "redDefend");
            return (Criteria) this;
        }

        public Criteria andRedDefendLessThan(Byte value) {
            addCriterion("red_defend <", value, "redDefend");
            return (Criteria) this;
        }

        public Criteria andRedDefendLessThanOrEqualTo(Byte value) {
            addCriterion("red_defend <=", value, "redDefend");
            return (Criteria) this;
        }

        public Criteria andRedDefendIn(List<Byte> values) {
            addCriterion("red_defend in", values, "redDefend");
            return (Criteria) this;
        }

        public Criteria andRedDefendNotIn(List<Byte> values) {
            addCriterion("red_defend not in", values, "redDefend");
            return (Criteria) this;
        }

        public Criteria andRedDefendBetween(Byte value1, Byte value2) {
            addCriterion("red_defend between", value1, value2, "redDefend");
            return (Criteria) this;
        }

        public Criteria andRedDefendNotBetween(Byte value1, Byte value2) {
            addCriterion("red_defend not between", value1, value2, "redDefend");
            return (Criteria) this;
        }

        public Criteria andRedCounterattackIsNull() {
            addCriterion("red_counterattack is null");
            return (Criteria) this;
        }

        public Criteria andRedCounterattackIsNotNull() {
            addCriterion("red_counterattack is not null");
            return (Criteria) this;
        }

        public Criteria andRedCounterattackEqualTo(Byte value) {
            addCriterion("red_counterattack =", value, "redCounterattack");
            return (Criteria) this;
        }

        public Criteria andRedCounterattackNotEqualTo(Byte value) {
            addCriterion("red_counterattack <>", value, "redCounterattack");
            return (Criteria) this;
        }

        public Criteria andRedCounterattackGreaterThan(Byte value) {
            addCriterion("red_counterattack >", value, "redCounterattack");
            return (Criteria) this;
        }

        public Criteria andRedCounterattackGreaterThanOrEqualTo(Byte value) {
            addCriterion("red_counterattack >=", value, "redCounterattack");
            return (Criteria) this;
        }

        public Criteria andRedCounterattackLessThan(Byte value) {
            addCriterion("red_counterattack <", value, "redCounterattack");
            return (Criteria) this;
        }

        public Criteria andRedCounterattackLessThanOrEqualTo(Byte value) {
            addCriterion("red_counterattack <=", value, "redCounterattack");
            return (Criteria) this;
        }

        public Criteria andRedCounterattackIn(List<Byte> values) {
            addCriterion("red_counterattack in", values, "redCounterattack");
            return (Criteria) this;
        }

        public Criteria andRedCounterattackNotIn(List<Byte> values) {
            addCriterion("red_counterattack not in", values, "redCounterattack");
            return (Criteria) this;
        }

        public Criteria andRedCounterattackBetween(Byte value1, Byte value2) {
            addCriterion("red_counterattack between", value1, value2, "redCounterattack");
            return (Criteria) this;
        }

        public Criteria andRedCounterattackNotBetween(Byte value1, Byte value2) {
            addCriterion("red_counterattack not between", value1, value2, "redCounterattack");
            return (Criteria) this;
        }

        public Criteria andGreenNameIsNull() {
            addCriterion("green_name is null");
            return (Criteria) this;
        }

        public Criteria andGreenNameIsNotNull() {
            addCriterion("green_name is not null");
            return (Criteria) this;
        }

        public Criteria andGreenNameEqualTo(String value) {
            addCriterion("green_name =", value, "greenName");
            return (Criteria) this;
        }

        public Criteria andGreenNameNotEqualTo(String value) {
            addCriterion("green_name <>", value, "greenName");
            return (Criteria) this;
        }

        public Criteria andGreenNameGreaterThan(String value) {
            addCriterion("green_name >", value, "greenName");
            return (Criteria) this;
        }

        public Criteria andGreenNameGreaterThanOrEqualTo(String value) {
            addCriterion("green_name >=", value, "greenName");
            return (Criteria) this;
        }

        public Criteria andGreenNameLessThan(String value) {
            addCriterion("green_name <", value, "greenName");
            return (Criteria) this;
        }

        public Criteria andGreenNameLessThanOrEqualTo(String value) {
            addCriterion("green_name <=", value, "greenName");
            return (Criteria) this;
        }

        public Criteria andGreenNameLike(String value) {
            addCriterion("green_name like", value, "greenName");
            return (Criteria) this;
        }

        public Criteria andGreenNameNotLike(String value) {
            addCriterion("green_name not like", value, "greenName");
            return (Criteria) this;
        }

        public Criteria andGreenNameIn(List<String> values) {
            addCriterion("green_name in", values, "greenName");
            return (Criteria) this;
        }

        public Criteria andGreenNameNotIn(List<String> values) {
            addCriterion("green_name not in", values, "greenName");
            return (Criteria) this;
        }

        public Criteria andGreenNameBetween(String value1, String value2) {
            addCriterion("green_name between", value1, value2, "greenName");
            return (Criteria) this;
        }

        public Criteria andGreenNameNotBetween(String value1, String value2) {
            addCriterion("green_name not between", value1, value2, "greenName");
            return (Criteria) this;
        }

        public Criteria andGreenAttackIsNull() {
            addCriterion("green_attack is null");
            return (Criteria) this;
        }

        public Criteria andGreenAttackIsNotNull() {
            addCriterion("green_attack is not null");
            return (Criteria) this;
        }

        public Criteria andGreenAttackEqualTo(Byte value) {
            addCriterion("green_attack =", value, "greenAttack");
            return (Criteria) this;
        }

        public Criteria andGreenAttackNotEqualTo(Byte value) {
            addCriterion("green_attack <>", value, "greenAttack");
            return (Criteria) this;
        }

        public Criteria andGreenAttackGreaterThan(Byte value) {
            addCriterion("green_attack >", value, "greenAttack");
            return (Criteria) this;
        }

        public Criteria andGreenAttackGreaterThanOrEqualTo(Byte value) {
            addCriterion("green_attack >=", value, "greenAttack");
            return (Criteria) this;
        }

        public Criteria andGreenAttackLessThan(Byte value) {
            addCriterion("green_attack <", value, "greenAttack");
            return (Criteria) this;
        }

        public Criteria andGreenAttackLessThanOrEqualTo(Byte value) {
            addCriterion("green_attack <=", value, "greenAttack");
            return (Criteria) this;
        }

        public Criteria andGreenAttackIn(List<Byte> values) {
            addCriterion("green_attack in", values, "greenAttack");
            return (Criteria) this;
        }

        public Criteria andGreenAttackNotIn(List<Byte> values) {
            addCriterion("green_attack not in", values, "greenAttack");
            return (Criteria) this;
        }

        public Criteria andGreenAttackBetween(Byte value1, Byte value2) {
            addCriterion("green_attack between", value1, value2, "greenAttack");
            return (Criteria) this;
        }

        public Criteria andGreenAttackNotBetween(Byte value1, Byte value2) {
            addCriterion("green_attack not between", value1, value2, "greenAttack");
            return (Criteria) this;
        }

        public Criteria andGreenDefendIsNull() {
            addCriterion("green_defend is null");
            return (Criteria) this;
        }

        public Criteria andGreenDefendIsNotNull() {
            addCriterion("green_defend is not null");
            return (Criteria) this;
        }

        public Criteria andGreenDefendEqualTo(Byte value) {
            addCriterion("green_defend =", value, "greenDefend");
            return (Criteria) this;
        }

        public Criteria andGreenDefendNotEqualTo(Byte value) {
            addCriterion("green_defend <>", value, "greenDefend");
            return (Criteria) this;
        }

        public Criteria andGreenDefendGreaterThan(Byte value) {
            addCriterion("green_defend >", value, "greenDefend");
            return (Criteria) this;
        }

        public Criteria andGreenDefendGreaterThanOrEqualTo(Byte value) {
            addCriterion("green_defend >=", value, "greenDefend");
            return (Criteria) this;
        }

        public Criteria andGreenDefendLessThan(Byte value) {
            addCriterion("green_defend <", value, "greenDefend");
            return (Criteria) this;
        }

        public Criteria andGreenDefendLessThanOrEqualTo(Byte value) {
            addCriterion("green_defend <=", value, "greenDefend");
            return (Criteria) this;
        }

        public Criteria andGreenDefendIn(List<Byte> values) {
            addCriterion("green_defend in", values, "greenDefend");
            return (Criteria) this;
        }

        public Criteria andGreenDefendNotIn(List<Byte> values) {
            addCriterion("green_defend not in", values, "greenDefend");
            return (Criteria) this;
        }

        public Criteria andGreenDefendBetween(Byte value1, Byte value2) {
            addCriterion("green_defend between", value1, value2, "greenDefend");
            return (Criteria) this;
        }

        public Criteria andGreenDefendNotBetween(Byte value1, Byte value2) {
            addCriterion("green_defend not between", value1, value2, "greenDefend");
            return (Criteria) this;
        }

        public Criteria andGreenCounterattackIsNull() {
            addCriterion("green_counterattack is null");
            return (Criteria) this;
        }

        public Criteria andGreenCounterattackIsNotNull() {
            addCriterion("green_counterattack is not null");
            return (Criteria) this;
        }

        public Criteria andGreenCounterattackEqualTo(Byte value) {
            addCriterion("green_counterattack =", value, "greenCounterattack");
            return (Criteria) this;
        }

        public Criteria andGreenCounterattackNotEqualTo(Byte value) {
            addCriterion("green_counterattack <>", value, "greenCounterattack");
            return (Criteria) this;
        }

        public Criteria andGreenCounterattackGreaterThan(Byte value) {
            addCriterion("green_counterattack >", value, "greenCounterattack");
            return (Criteria) this;
        }

        public Criteria andGreenCounterattackGreaterThanOrEqualTo(Byte value) {
            addCriterion("green_counterattack >=", value, "greenCounterattack");
            return (Criteria) this;
        }

        public Criteria andGreenCounterattackLessThan(Byte value) {
            addCriterion("green_counterattack <", value, "greenCounterattack");
            return (Criteria) this;
        }

        public Criteria andGreenCounterattackLessThanOrEqualTo(Byte value) {
            addCriterion("green_counterattack <=", value, "greenCounterattack");
            return (Criteria) this;
        }

        public Criteria andGreenCounterattackIn(List<Byte> values) {
            addCriterion("green_counterattack in", values, "greenCounterattack");
            return (Criteria) this;
        }

        public Criteria andGreenCounterattackNotIn(List<Byte> values) {
            addCriterion("green_counterattack not in", values, "greenCounterattack");
            return (Criteria) this;
        }

        public Criteria andGreenCounterattackBetween(Byte value1, Byte value2) {
            addCriterion("green_counterattack between", value1, value2, "greenCounterattack");
            return (Criteria) this;
        }

        public Criteria andGreenCounterattackNotBetween(Byte value1, Byte value2) {
            addCriterion("green_counterattack not between", value1, value2, "greenCounterattack");
            return (Criteria) this;
        }

        public Criteria andIsVictoryIsNull() {
            addCriterion("is_victory is null");
            return (Criteria) this;
        }

        public Criteria andIsVictoryIsNotNull() {
            addCriterion("is_victory is not null");
            return (Criteria) this;
        }

        public Criteria andIsVictoryEqualTo(Boolean value) {
            addCriterion("is_victory =", value, "isVictory");
            return (Criteria) this;
        }

        public Criteria andIsVictoryNotEqualTo(Boolean value) {
            addCriterion("is_victory <>", value, "isVictory");
            return (Criteria) this;
        }

        public Criteria andIsVictoryGreaterThan(Boolean value) {
            addCriterion("is_victory >", value, "isVictory");
            return (Criteria) this;
        }

        public Criteria andIsVictoryGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_victory >=", value, "isVictory");
            return (Criteria) this;
        }

        public Criteria andIsVictoryLessThan(Boolean value) {
            addCriterion("is_victory <", value, "isVictory");
            return (Criteria) this;
        }

        public Criteria andIsVictoryLessThanOrEqualTo(Boolean value) {
            addCriterion("is_victory <=", value, "isVictory");
            return (Criteria) this;
        }

        public Criteria andIsVictoryIn(List<Boolean> values) {
            addCriterion("is_victory in", values, "isVictory");
            return (Criteria) this;
        }

        public Criteria andIsVictoryNotIn(List<Boolean> values) {
            addCriterion("is_victory not in", values, "isVictory");
            return (Criteria) this;
        }

        public Criteria andIsVictoryBetween(Boolean value1, Boolean value2) {
            addCriterion("is_victory between", value1, value2, "isVictory");
            return (Criteria) this;
        }

        public Criteria andIsVictoryNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_victory not between", value1, value2, "isVictory");
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