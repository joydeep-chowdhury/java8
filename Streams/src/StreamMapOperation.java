import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import util.StudentDao;

public class StreamMapOperation 
{
   public static void main(String args[])
   {
	   List<String> nameList=StudentDao.getAllStudents().stream().map(s->s.getName()).map(s->s.toUpperCase()).collect(Collectors.toList());
	   Set<String> nameSet=StudentDao.getAllStudents().stream().map(s->s.getName()).map(s->s.toUpperCase()).collect(Collectors.toSet());
	   
	   System.out.println(nameList);
	   System.out.println(nameSet);
   }
}
