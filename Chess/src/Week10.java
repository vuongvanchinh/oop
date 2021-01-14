
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Week10 {

   private static String[] pri =
      { "int", "boolean", "char", "byte", "short", "long", "float", "double" };

   private static boolean isPrimary(String type) {
      for (String t : pri) {
         if (type.equals(t)) {
            return true;
         }
      }
      return false;
   }

   /**
    * c.
    * @param fileContent c.
    * @return c.
    */
   public List<String> getAllFunctions(String fileContent) {
      Util u = new Util();

      fileContent = fileContent.replaceAll( "//.*|(\"(?:\\\\[^\"]|\\\\\"|.)*?\")|(?s)/\\*.*?\\*/", "$1 " );
      List<String> result = new ArrayList<>();
      //(static) +[\w\\<\\>\[\]]+\s+(\w+) *\([^\)]*\)
      String regex = "(static) +[\\w\\<\\>\\[\\]]+\\s+(\\w+) *\\([^\\)]*\\)";
      Pattern pattern = Pattern.compile(regex);
      Matcher matcher;
      matcher = pattern.matcher(fileContent);
      String s;
      String parameters;
      String t;
      while (matcher.find()) {
         s = matcher.group();
         parameters = s.substring(s.indexOf("(") + 1, s.length() - 1);
         if (!parameters.equals("")) {
            String[] parameter = parameters.split(",");
            for (String p : parameter) {
               t = p.trim().substring(0, p.trim().indexOf(' '));
               s = s.replace(p, u.getFull(t));
            }
         }
         result.add(s.split(" ")[2]);
      }
      return result;
   }

   public static void main(String[] args) {
      Week10 t = new Week10();
      String fileContent = "// hello \n public static void main(Object t, String t) { \n /* hihi*/} static hello<Wall> default(int e, int q) {} ";
      List<String> result = t.getAllFunctions(fileContent);
      for (String string : result) {
         System.out.println(string);
      }
   }
}

class Util {
   public Map<String, String> lib = new HashMap<>();
   public Util() {
      lib.put("String","java.lang.String");
      lib.put("Object", "java.lang.Object");
      lib.put("Path", "java.nio.file.Path");
      lib.put("TemporalAccessor", "java.time.temporal.TemporalAccessor");
      lib.put("Date", "java.util.Date");
      lib.put("LocalDateTime", "java.time.LocalDateTime");
      lib.put("ZonedDateTime", "java.time.ZonedDateTime");
      lib.put("LocalDate", "java.time.LocalDate");
      lib.put("Random", "import java.util.Random");
      lib.put("OffsetDateTime", "java.time.OffsetDateTime");
      lib.put("Instant", "java.time.Instant");
      lib.put("LocalTime", "java.time.LocalTime");
      lib.put("TemporalField", "java.time.temporal.TemporalField");
      lib.put("MonthDay", "java.time.MonthDay");
      lib.put("YearMonth", "java.time.YearMonth");
      lib.put("Year", "java.time.Year");
   }

   /**
    * c.
    * @param str c.
    * @return c.
    */
   public String getFull(String str) {
      String r = lib.get(str);
      if (r != null) {
         return r;
      }
      return str;
   }
}
