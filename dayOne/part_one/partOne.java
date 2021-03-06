package part_one;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class partOne {
    private static int countIncreases(List<Integer> list){
        int count = 0;
        for(int i = 1; i < list.size(); ++i){
            int max = Math.max(list.get(i), list.get(i-1));
            if(max == list.get(i)){
                ++count;
            }
        }
        System.out.println(count);
        return count;
    }

    public static void main(String args[]) throws FileNotFoundException, IOException{
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        String str;
        List<Integer> vals = new ArrayList<>();
        while((str = br.readLine()) != null){
            vals.add(Integer.valueOf(str));
        }
        countIncreases(vals);
    }
}
