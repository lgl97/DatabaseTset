import lombok.Data;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;
import java.util.stream.Collectors;

public class TestDemo {

    private final Logger logger = LoggerFactory.getLogger(TestDemo.class);

    @Test
    public void testRandom(){
        Integer a = 128,b = 128;
        //System.out.println(127 == 127);
        System.out.println(a.equals(b));
        /*Random random = new Random();
        for (int i = 0;i < 10; i++){
            double a = random.nextDouble();
            System.out.println(a);
        }*/
    }
    @Test
    public void testArrayList(){
        ArrayList<Integer> nums = new ArrayList<>();
        Random random = new Random();
        for (int i = 0;i < 10; i++){
            Integer a = random.nextInt();
            nums.add(a);
        }
        for(Integer inte : nums){
            System.out.println(inte);
        }
        //nums.subList(0,5);
    }

    @Test
    public void exceptionTest() throws RuntimeException{
        try {
            logger.info("发生了异常：信息为");
            logger.error("发生了异常：信息为");
            int a = 10/0;
            Object obj = null;
            System.out.println(a);
            System.out.println(obj.toString());
        } catch (Exception e) {
            //e.printStackTrace();
//            logger.warn("发生了{}异常：信息为：{}",e.getClass(),e.getMessage());
            logger.info("发生了{}异常：信息为：{}",e.getClass(),e.getMessage());
            //throw new RuntimeException();
        }finally {
            System.out.println("OK");
        }
    }

    @Test
    public void myPrint(){
        char[] d1 = new char[]{'\u5BC6','\u7801','\u4FEE','\u6539','\u8BE5','\u6210','\u529F','\u8BF7','\u4F7F','\u7528',
                '\u65B0','\u5BC6','\u7801','\u91CD','\u65B0','\u767B','\u5F55'}; //\u5BC6\u7801\u4FEE\u6539\u8BE5\u6210\u529F,\u8BF7\u4F7F\u7528\u65B0\u5BC6\u7801\u91CD\u65B0\u767B\u5F55
        System.out.println(d1);
    }

    @Test
    public void streamTest(){
        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6);
        int sum = integerList.stream().map(item -> item * 2).reduce(0, Integer::sum);
        // 过滤偶数
        List<Integer> collect = integerList.stream().filter(integer -> integer % 2 == 0).collect(Collectors.toList());
        System.out.println(collect.toString());
        Object i = 1L;
        if(i instanceof Long){
            System.out.println("is Long");
        }
        //
//        Stream<Integer> integerStream = integerList.stream();
//        int i = 3;
//        Predicate<Integer> data =  (c) -> integerList.remove(c);
//        integerList.stream().filter( t -> {
//            System.out.println(t.toString());
//        }).collect(Collectors.toList());
//
//        int sum = integerList.stream().filter(w -> w.toString() == "1").mapToInt(w -> w).sum();
        //Widget[] widgets = {new Widget("RED",10),new Widget("yellow",5)};
//        List<Widget> widgets = Arrays.asList(new Widget("RED",10),new Widget("yellow",5));
//        int sum = widgets.stream().filter(w -> w.getColor() == "RED").mapToInt(w -> w.getWeight()).sum();
//        System.out.println(sum);
    }
    @Data
    class Widget{
        String color;
        int weight;
        Widget(String color,int weight){
            this.color = color;
            this.weight = weight;
        }
    }

    @Test
    public void objToDouble(){
//        Object obj = 4234.53453D;
//        System.out.println(obj.toString());
//        Long i = -1L;
//        System.out.println(i.equals(-1L));
//        System.out.println(i == -1L);
//        System.out.println(i < 0);
//        System.out.println(1L <= 1L);
        System.out.println("建筑专业负责人".substring(0,2));
    }

}
