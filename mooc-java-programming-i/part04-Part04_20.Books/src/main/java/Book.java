
public class Book {
        private String title;
        private int pages;
        private int year;
        
        public Book(String theTitle, int numPages, int theYear){
            this.title = theTitle;
            this.pages = numPages;
            this.year = theYear;
        }
        
        public String getTitle(){
            return this.title;
        }
        public int getPage(){
            return this.pages;
        }
        public int getYear(){
            return this.year;
        }
        
        @Override
        public String toString(){
           return this.title + ", "+ this.pages+" pages, "+this.year;
        }
        
        
        
}
