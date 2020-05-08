package com.test;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    // change something
    

    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        /*String str = input.nextLine();
        char[] chars = str.toCharArray();
        String regex = input.nextLine();
        int count = 0;
        for (int i = 0 ;i < str.length() ;i++){
            if(regex.equalsIgnoreCase(chars[i]+"")){
                count++;
            }
        }
        System.out.println(count);*/
        /*int length = input.nextInt();
        TreeSet<Integer> sets = new TreeSet<>();
        for (int i = 0; i< length; i++){
            sets.add(input.nextInt());
        }
        Iterator<Integer> iterator = sets.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }*/

        int length = input.nextInt();
        List<Integer> list = new ArrayList<>(length);
        int count = 0;
        while (count < length){
            list.add(input.nextInt());
            count++;
        }
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1.equals(o2)){
                    return 0;
                }else if(o1 > o2){
                    return 1;
                }else {
                    return -1;
                }
            }
        });
//        Collections.sort(list);
        List<Integer> collect = list.stream().distinct().collect(Collectors.toList());
        collect.stream().forEach((i)-> System.out.println(i));

        Class<Main> c = Main.class;
        try {
            Main main = c.newInstance();

        } catch (InstantiationException e) {

        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
