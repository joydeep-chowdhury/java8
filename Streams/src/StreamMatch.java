import util.StudentDao;

public class StreamMatch {
  public static void main(String args[])
  {
	  boolean allMatch=StudentDao.getAllStudents().stream().allMatch(s->s.getGpa()>5);
	  boolean anyMatch=StudentDao.getAllStudents().stream().anyMatch(s->s.getGpa()>9);
	  boolean noneMatch=StudentDao.getAllStudents().stream().noneMatch(s->s.getGpa()<8);
	  System.out.println(allMatch);
	  System.out.println(anyMatch);
	  System.out.println(noneMatch);
  }
}
