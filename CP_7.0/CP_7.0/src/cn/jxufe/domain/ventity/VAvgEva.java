package cn.jxufe.domain.ventity;

public class VAvgEva {

	/**
	 * 专业学习
	 * 
	 * @pdOid 1f2e3d9c-6395-408d-9808-3bf3b1c2ce5c
	 */
	public long gProLea;
	/**
	 * 非专业学习
	 * 
	 * @pdOid 26b04746-589d-4a8b-8d84-924726246f3e
	 */
	public long gNonProLea;
	/**
	 * 课外学习
	 * 
	 * @pdOid 0adee881-72a8-4d0b-9b07-6bc3f799d69b
	 */
	public long gExtraLearn;
	/**
	 * 身体健康
	 * 
	 * @pdOid 82741941-3242-47f7-9d5f-9ec85c01bc3e
	 */
	public long gPhyHealth;
	/**
	 * 心理健康
	 * 
	 * @pdOid fd4d2449-11dc-4b59-9d8c-27a0188ffcf3
	 */
	public long gMentalHealth;
	/**
	 * 理财
	 * 
	 * @pdOid 553bfe26-2ccb-4a05-83e8-cb4363cea977
	 */
	public long gManageMoney;
	/**
	 * 人际沟通
	 * 
	 * @pdOid 72a541e1-a276-4260-aeeb-dd5fb983557b
	 */
	public long gInterpersonal;
	/**
	 * 社团部门
	 * 
	 * @pdOid 5ca705c8-a880-4566-8409-0bdfae33ac9f
	 */
	public long gClubEvent;
	/**
	 * 社会
	 * 
	 * @pdOid 182392b2-e651-4e35-8baa-be78f97a0111
	 */
	public long gSocialEvent;

	/**
	 * 用户Id
	 */
	private int userId;

	/**
	 * 用户号
	 */
	private String userNum;
	/**
	 * 用户名
	 */
	private String userName;
	/**
	 * 评价人Id
	 */
	private int evauserId;
	/**
	 * 学期号
	 */
	private int termNum;
	/**
	 * 班级号
	 */
	private int unitId;
	public long getgProLea() {
		return gProLea;
	}
	public void setgProLea(long gProLea) {
		this.gProLea = gProLea;
	}
	public long getgNonProLea() {
		return gNonProLea;
	}
	public void setgNonProLea(long gNonProLea) {
		this.gNonProLea = gNonProLea;
	}
	public long getgExtraLearn() {
		return gExtraLearn;
	}
	public void setgExtraLearn(long gExtraLearn) {
		this.gExtraLearn = gExtraLearn;
	}
	public long getgPhyHealth() {
		return gPhyHealth;
	}
	public void setgPhyHealth(long gPhyHealth) {
		this.gPhyHealth = gPhyHealth;
	}
	public long getgMentalHealth() {
		return gMentalHealth;
	}
	public void setgMentalHealth(long gMentalHealth) {
		this.gMentalHealth = gMentalHealth;
	}
	public long getgManageMoney() {
		return gManageMoney;
	}
	public void setgManageMoney(long gManageMoney) {
		this.gManageMoney = gManageMoney;
	}
	public long getgInterpersonal() {
		return gInterpersonal;
	}
	public void setgInterpersonal(long gInterpersonal) {
		this.gInterpersonal = gInterpersonal;
	}
	public long getgClubEvent() {
		return gClubEvent;
	}
	public void setgClubEvent(long gClubEvent) {
		this.gClubEvent = gClubEvent;
	}
	public long getgSocialEvent() {
		return gSocialEvent;
	}
	public void setgSocialEvent(long gSocialEvent) {
		this.gSocialEvent = gSocialEvent;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserNum() {
		return userNum;
	}
	public void setUserNum(String userNum) {
		this.userNum = userNum;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getEvauserId() {
		return evauserId;
	}
	public void setEvauserId(int evauserId) {
		this.evauserId = evauserId;
	}
	public int getTermNum() {
		return termNum;
	}
	public void setTermNum(int termNum) {
		this.termNum = termNum;
	}
	public int getUnitId() {
		return unitId;
	}
	public void setUnitId(int unitId) {
		this.unitId = unitId;
	}

	
	
}
