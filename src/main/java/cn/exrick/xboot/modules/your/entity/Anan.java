package cn.exrick.xboot.modules.your.entity;

import cn.exrick.xboot.base.XbootBaseEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author Exrick
 */
@Data
@Entity
@Table(name = "t_anan")
@TableName("t_anan")
@ApiModel(value = "测试")
public class Anan extends XbootBaseEntity {

    private static final long serialVersionUID = 1L;
    @ApiModelProperty(value="用户名")
    @Column(unique=true,nullable=false)
    private  String username1;

    @ApiModelProperty(value = "密码")
    @Column(length = 18, nullable = false)
    private String password;

}