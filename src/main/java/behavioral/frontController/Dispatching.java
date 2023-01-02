package behavioral.frontController;

public class Dispatching {
    private StudentView studentView = new StudentView();
    private TeacherView teacherView = new TeacherView();

    public void dispatch(String request){
        if(request.equalsIgnoreCase("Student")) {
            studentView.display();
        }else{
            teacherView.display();
        }
    }
}
