import java.math.BigDecimal;

/**
 * @Auther: wanghaiyang
 * @Date: 20/2/25 15:39
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        ICourse javaCourse = new JavaCourse(96, "Java从零到企业级电商开发", new BigDecimal(348));
        System.out.println("课程ID：" + javaCourse.getId() + "，课程名称" + javaCourse.getName() + "，课程价格" + javaCourse.getPrice());
    }
}