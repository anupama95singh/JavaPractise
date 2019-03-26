import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {

  public void StreamExample() {
	  ArrayList<Integer> list = new ArrayList<Integer>();
	  list.add(1);
	  list.add(4);
	  list.add(6);
	  list.add(8);
	  list.add(10);
	  
	  System.out.println(list);
	  
	  //now just want to filter only even no's
	  
	  List<Integer> list2 = list.stream().filter(i -> i%2 == 0).collect(Collectors.toList());
	  System.out.println(list2);
	  
	  ArrayList<Integer> marks = new ArrayList<Integer>();
	  marks.add(1);
	  marks.add(4);
	  marks.add(6);
	  marks.add(8);
	  marks.add(10);
	  
	  System.out.println(marks);
	  
	  // now just want to add 5 grace marks to each list object
	  
	  List<Integer> marks2 = list.stream().map(i -> i+5).collect(Collectors.toList());
	  System.out.println(marks2);
	  
	  //filter the marks
	  
	  List<Integer> marks3 = list.stream().filter(i -> i>5).collect(Collectors.toList());
	  System.out.println(marks3);
	  
	  //if i want to count the filtered marks
	  
	  long noOfFilteredMarks = marks3.stream().filter(i -> i>5).count();
	  System.out.println(noOfFilteredMarks);
	  
	  //want to sort the elements
	  //by default ascending
	  
	  List<Integer> sortedList = marks3.stream().sorted().collect(Collectors.toList());
	  System.out.println(sortedList);
	  
	  //by default descending
	  
	  List<Integer> sortedListDesc = marks3.stream().sorted((i1,i2) -> (i1<i2) ? 1 : (i1>i2) ? -1 : 0).collect(Collectors.toList());
	  System.out.println(sortedListDesc);
  }
	
  public static void main(String[] args) {
	  Stream obj = new Stream();
	  obj.StreamExample();
  }
}
