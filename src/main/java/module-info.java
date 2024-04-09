module org.example.eecs3311project {
  requires javafx.controls;
  requires javafx.fxml;
  requires javafx.web;
  requires junit;

  exports UsermadeTests.studenttests ;
  exports UsermadeTests.Book ;
  exports UsermadeTests.Usertests ;
  exports UsermadeTests.Accounthandling ;
  exports UsermadeTests.Subscription ;
  exports UsermadeTests.CourseTest ;
  exports UsermadeTests.Borrowingrecordtest ;
  exports UsermadeTests.Physicalitemhandling ;
  exports UsermadeTests.Facultytest ;
  exports UsermadeTests.SystemManagerUser ;
  exports UsermadeTests.UserFactory ;
  exports UsermadeTests.obsevertest ;
  exports UsermadeTests.Subscriptionhandling ;
  exports UsermadeTests.OnlineBook ;
  exports UsermadeTests.LatePenaltyStrategy ;
  exports UsermadeTests.OnTimePenaltyStrategy ;
  exports UsermadeTests.TextBookChecker ;
  exports UsermadeTests.Request ;
  exports UsermadeTests.ConcreteStratOverdue ;
  exports UsermadeTests.ConcreteStratNormal ;
  exports UsermadeTests.Textbook ;

  opens org.example.eecs3311project to javafx.fxml;
  //    exports org.example.eecs3311project;
}
