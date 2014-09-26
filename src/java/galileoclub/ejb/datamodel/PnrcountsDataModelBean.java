/*
 * PnrcountsDataModelBean.java
 * 
 * Created on Dec 19, 2008, 10:28:33 AM
 */
package galileoclub.ejb.datamodel;

import javax.ejb.Stateless;

/**
 *
 * @author Samuel Franklyn
 */
@Stateless
public class PnrcountsDataModelBean extends BaseDataModelBean implements PnrcountsDataModelRemote {

    public static final String SELECT_ALL = "Pnrcounts.selectAll";
    public static final String SELECT_ALL_COUNT = "Pnrcounts.selectAllCount";
    public static final String SELECT_GROUP_BY_YEARMONTH = "Pnrcounts.selectGroupByYearMonth";
    public static final String SELECT_GROUP_BY_YEARMONTH_DSC = "Pnrcounts.selectGroupByYearMonthDsc";
    public static final String SELECT_GROUP_BY_YEARMONTH_COUNT = "Pnrcounts.selectGroupByYearMonthCount";
    public static final String SUM_BY_DATE = "Pnrcounts.sumByDate";
    public static final String SUM_NAME_BY_DATE = "Pnrcounts.sumNameByDate";
    public static final String SUM_WAIT_BY_DATE = "Pnrcounts.sumWaitByDate";
    public static final String SUM_BY_DATE_PLUS = "Pnrcounts.sumByDatePlus";
    public static final String SUM_BY_DATE_MINUS = "Pnrcounts.sumByDateMinus";
    public static final String SELECT_GROUP_BY_PCC = "Pnrcounts.selectGroupByPcc";
    public static final String SELECT_GROUP_BY_PCC_YEARMONTH = "Pnrcounts.selectGroupByPccYearMonth";
    public static final String SELECT_GROUP_BY_PCC_YEARMONTH_DSC = "Pnrcounts.selectGroupByPccYearMonthDsc";
    public static final String SELECT_GROUP_BY_PCC_COUNT = "Pnrcounts.selectGroupByPccCount";
    public static final String SELECT_GROUP_BY_PCCSIGNON = "Pnrcounts.selectGroupByPccSignOn";
    public static final String SELECT_GROUP_BY_PCCSIGNON_COUNT = "Pnrcounts.selectGroupByPccSignOnCount";
    public static final String SELECT_BY_DATEPCCSIGNON = "Pnrcounts.selectByDatePccSignOn";
    public static final String SELECT_BY_DATEPCCSIGNON_COUNT = "Pnrcounts.selectByDatePccSignOnCount";
    public static final String SELECT_GROUP_BY_PCCSIGNON_BY_YEARMONTH = "Pnrcounts.selectGroupByPccSignOnByYearMonth";
    public static final String SELECT_GROUP_BY_PCCSIGNON_BY_YEARMONTH1 = "Pnrcounts.selectGroupByPccSignOnByYearMonth1";
    public static final String SELECT_BY_DATEPCC = "Pnrcounts.selectByDatePcc";
    public static final String SELECT_BY_DATEPCC_COUNT = "Pnrcounts.selectByDatePccCount";
    public static final String SELECT_GROUP_BY_PCCFIND = "Pnrcounts.selectGroupByPccFind";
    public static final String SELECT_GROUP_BY_PCCDESCFIND = "Pnrcounts.selectGroupByPccDescFind";
    public static final String SELECT_GROUP_BY_PCCFIND2 = "Pnrcounts.selectGroupByPccFind2";
    public static final String SELECT_GROUP_BY_PCCDESCFIND2 = "Pnrcounts.selectGroupByPccDescFind2";
    public static final String SELECT_GROUP_BY_YEARMONTH_BY_PCCSIGNON = "Pnrcounts.selectGroupByYearMonthByPccSignOn";
    public static final String SELECT_GROUP_ALL_BY_PCC = "Pnrcounts.selectGroupAllByPcc";
}
