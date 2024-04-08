module org.example.eecs3311project {
    requires javafx.controls;
    requires javafx.fxml;
	requires javafx.web;
	requires junit;
	
	
	exports Randoop.junits.BOOK;
	exports Randoop.junits.BorrowingRecord;
	exports Randoop.junits.CD;
	exports Randoop.junits.Course;
	exports Randoop.junits.Faculty;
	exports Randoop.junits.NewsletterTest;
	exports Randoop.junits.ConcreteStratNormalTest;
    exports Randoop.junits.ConcreteStratOverdueTest;
    exports Randoop.junits.LatePenalyStrategyTest;
    exports Randoop.junits.MagazineTest;
    exports Randoop.junits.NonFacultyTest;
    exports Randoop.junits.NotificationTest;
    exports Randoop.junits.ObserverTest;
    exports Randoop.junits.OnlineBookTest;
    exports Randoop.junits.OnTimePenaltyStrategyTest;
    exports Randoop.junits.PaymentOptionTest;
    exports Randoop.junits.RequestTest;
    exports Randoop.junits.Student;
    exports Randoop.junits.SubscribtionTest;
    exports Randoop.junits.SystemManagerUserTest;
    exports Randoop.junits.TextbookCheckerTest;
    exports Randoop.junits.TextbookTest;
    exports Randoop.junits.UserCreationFactoryTest;
    exports Randoop.junits.Usertests;
    exports Randoop.junits.VisitorTest; 	
	
	
	


    opens org.example.eecs3311project to javafx.fxml;
    exports org.example.eecs3311project;
}