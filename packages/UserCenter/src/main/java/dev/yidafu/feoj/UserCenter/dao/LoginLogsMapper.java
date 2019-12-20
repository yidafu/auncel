package dev.yidafu.surpass.UserCenter.dao;

import dev.yidafu.surpass.UserCenter.entity.LoginLogs;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface LoginLogsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table login_logs
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table login_logs
     *
     * @mbg.generated
     */
    int insert(LoginLogs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table login_logs
     *
     * @mbg.generated
     */
    LoginLogs selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table login_logs
     *
     * @mbg.generated
     */
    List<LoginLogs> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table login_logs
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(LoginLogs record);
}