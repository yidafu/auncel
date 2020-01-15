package dev.yidafu.surpass.UserCenter.dao;

import dev.yidafu.surpass.UserCenter.entity.Authentications;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface AuthenticationsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table authentications
     *
     * @mbg.generated
     */
    @Delete({
        "delete from authentications",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table authentications
     *
     * @mbg.generated
     */
    @Insert({
        "insert into authentications (id, userId, ",
        "appType, appUserId, ",
        "accessToken)",
        "values (#{id,jdbcType=INTEGER}, #{userId,jdbcType=INTEGER}, ",
        "#{appType,jdbcType=INTEGER}, #{appUserId,jdbcType=VARCHAR}, ",
        "#{accessToken,jdbcType=VARCHAR})"
    })
    int insert(Authentications record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table authentications
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "id, userId, appType, appUserId, accessToken",
        "from authentications",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="userId", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="appType", property="appType", jdbcType=JdbcType.INTEGER),
        @Result(column="appUserId", property="appUserId", jdbcType=JdbcType.VARCHAR),
        @Result(column="accessToken", property="accessToken", jdbcType=JdbcType.VARCHAR)
    })
    Authentications selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table authentications
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "id, userId, appType, appUserId, accessToken",
        "from authentications"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="userId", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="appType", property="appType", jdbcType=JdbcType.INTEGER),
        @Result(column="appUserId", property="appUserId", jdbcType=JdbcType.VARCHAR),
        @Result(column="accessToken", property="accessToken", jdbcType=JdbcType.VARCHAR)
    })
    List<Authentications> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table authentications
     *
     * @mbg.generated
     */
    @Update({
        "update authentications",
        "set userId = #{userId,jdbcType=INTEGER},",
          "appType = #{appType,jdbcType=INTEGER},",
          "appUserId = #{appUserId,jdbcType=VARCHAR},",
          "accessToken = #{accessToken,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Authentications record);
}