learning mybatis

# ==========================
# 简介

## MyBatis 框架可以实现数据库操作
## MyBatis 封装了一些冗余的JDBC处理
--封装了Connection连接的获取和释放
--封装了Statement的创建和参数设置
--封装了ResultSet和实体对象的映射

## 利用MyBatis程序可以做以下工作:
--提供数据连接参数(SqlMapConfig.xml)
--提供SQL语句(xml文件)
--利用MyBatis提供的API
  SqlSession

====================================
# 如何搭建MyBatis使用环境

--引入mybatis和数据库驱动的jar
--引入SqlMapConfig.xml
--获取SqlSession

=======================================
# 对d_user表的操作
--编写User实体类
--编写定义SQL的UserSQL.xml
--利用SQLSession执行

======================================
# 使用技巧一:mapper

## mapper就是一个按规则编写好的接口
## mapper映射器规则
--编写一个接口, 用SQL定义的id做方法名
  用SQL定义的parameterType做参数类型
  用SQL定义的resultType定义返回类型
--用接口给SQL定义文件的namespace属性指定

============================================
# 使用技巧二: 分页处理
## 1.创建一个新的实体Page
---offset: 起始位置(偏移量), 从0开始
---size:从起始位置开始取的数量
import java.io.Serializable;

public class Page implements Serializable {
    private int offSet;
    private int size;

    public Page(int offSet, int size){
        super();
        this.offSet = offSet;
        this.size = size;
    }


## 2.在UserSql.xml中定义分页查询的方法:
<select id="findPage" parameterType="org.study.entity.Page" resultType="org.study.entity.User">
    select * from d_user limit #{offSet}, #{size}
</select>

