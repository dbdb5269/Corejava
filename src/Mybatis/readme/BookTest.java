package Mybatis.readme;

import org.junit.Test;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by dubo on 16/11/17.
 */
public class BookTest {
    @Test
    public void test(){
       try {
           BookService bookService = new BookService();
//           bookService.addBook(new Book(1,"hello","author",new Date(),100.00));
           //Book book = bookService.findBookByName("hello");
//           Book book = bookService.findBookById(1);
//           int countOfBook = bookService.findCountOfBook();
//           System.out.println(countOfBook);
//           List<String> allBooksName = bookService.findAllBooksName();
//           for (String allBooksNames:allBooksName){
//               System.out.println(allBooksNames);
//           }
           List<Map<String,Object>> booknameAndauthor=bookService.findBookNameAndAuthor();
           for (Map<String, Object> bookMap:booknameAndauthor){
               for (String key:bookMap.keySet()){
                   System.out.println(key+"-"+bookMap.get(key));
               }

           }
       }catch (Exception e){
           e.printStackTrace();
       }
    }
}
