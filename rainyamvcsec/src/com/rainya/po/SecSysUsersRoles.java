package com.rainya.po;

public class SecSysUsersRoles {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sec_sys_users_roles.ID
     *
     * @mbggenerated
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sec_sys_users_roles.ROLE_ID
     *
     * @mbggenerated
     */
    private String roleId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sec_sys_users_roles.USER_ID
     *
     * @mbggenerated
     */
    private String userId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sec_sys_users_roles.ID
     *
     * @return the value of sec_sys_users_roles.ID
     *
     * @mbggenerated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sec_sys_users_roles.ID
     *
     * @param id the value for sec_sys_users_roles.ID
     *
     * @mbggenerated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sec_sys_users_roles.ROLE_ID
     *
     * @return the value of sec_sys_users_roles.ROLE_ID
     *
     * @mbggenerated
     */
    public String getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sec_sys_users_roles.ROLE_ID
     *
     * @param roleId the value for sec_sys_users_roles.ROLE_ID
     *
     * @mbggenerated
     */
    public void setRoleId(String roleId) {
        this.roleId = roleId == null ? null : roleId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sec_sys_users_roles.USER_ID
     *
     * @return the value of sec_sys_users_roles.USER_ID
     *
     * @mbggenerated
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sec_sys_users_roles.USER_ID
     *
     * @param userId the value for sec_sys_users_roles.USER_ID
     *
     * @mbggenerated
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }
}