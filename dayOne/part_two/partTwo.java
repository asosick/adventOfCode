
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class partTwo {
    private static int countIncreases(List<Integer> list){
        int count = 0;
        for(int i = 0; i < list.size() - 3; ++i){
            int valOne = list.get(i) + list.get(i+1) + list.get(i+2);
            int valTwo = list.get(i+1) + list.get(i+2) + list.get(i+3);
            if(valTwo > valOne){
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
