package sessiondemo.utils;

import java.time.LocalDateTime;

public class Form
{

    private Form(){}

    public static String getInputFieldForm(){

        String formStr = upperHtml("Servelet") +
                "      <form action = \"http://localhost:8080/post\" method = \"post\">\n" +
                "         First name: \n" +
                "            <input type = \"text\" name = \"first_name\" value = \"\" maxlength = \"100\" />\n" +
                "         <br />\n" +
                "         \n" +
                "         Last name: \n" +
                "            <input type = \"text\" name = \"last_name\" value = \"\" maxlength = \"100\" />\n" +
                "         <input type = \"submit\" value =\"Submit\" />\n" +
                "      </form>\n" +
                "" + lowerHtml();

        return formStr;
    }


    public static String upperHtml(String title){
        String upper = "<!DOCTYPE html>\n" +
                "<html>\n" +
                "\n" +
                "   <head>\n" +
                "      <title>"+ title  +"</title>\n" +
                "   </head>\n" +
                "\n" +
                "   <body>\n";

        return upper;
    }

    public static String lowerHtml(){
        String lower =      "</body>\n" +
                        "</html>";

        return lower;
    }

    public static String getFormWithRIC(){
        String form = upperHtml("Servelets") +
                "<h3>Fill up Details</h3>"+
                "         <br />\n" +
                "         <br />\n" +

                " <form action = \"http://localhost:8080/task\" method = \"post\">\n" +
                "Name: \n" +
                "<input type = \"text\" name = \"name\" value = \"\" maxlength = \"100\" />\n" +
                "         <br />\n" +
                "         <br />\n" +
                "  <input type=\"radio\" name=\"gender\" value=\"male\" > Male<br>\n" +
                "  <input type=\"radio\" name=\"gender\" value=\"female\"> Female<br>\n" +
                "  <input type=\"radio\" name=\"gender\" value=\"other\"> Other  \n\n" +
                "           <br />\n" +
                "           <br />\n" +
                "Subject: \n" +
                "<input type = \"checkbox\" name = \"subject\" value=\"maths\" /> Maths\n" +
                "         <input type = \"checkbox\" name = \"subject\" value=\"Physics\" /> Physics\n" +
                "         <input type = \"checkbox\" name = \"subject\" value=\"English\" /> English\n" +
                "           <br />\n" +
                "           <br />\n" +
                "<select name = \"car\">\n" +
                "  <option value=\"volvo\">Volvo</option>\n" +
                "  <option value=\"saab\">Saab</option>\n" +
                "  <option value=\"mercedes\">Mercedes</option>\n" +
                "  <option value=\"audi\">Audi</option>\n" +
                "</select> \n" +
                "         <input type = \"submit\" value =\"Submit\" />\n" +
                "</form> "

                +   lowerHtml();

        return form;
    }

    public static String getSelectMenuWithIdInput(){
        String selectForm =
                upperHtml("Filtre") +
                        "<h3>Car Filter</h3>"+
                        "         <br />\n" +

                        " <form action = \"http://localhost:8080/car\" method = \"post\">\n" +
                        "Id: \n" +
                        "<input type = \"text\" name = \"id\" value = \"\" maxlength = \"10\" />\n" +
                        "         <br />\n" +
                        "         <br />\n" +
                        "<select name = \"car\">\n" +
                        "  <option value=\"volvo\">Volvo</option>\n" +
                        "  <option value=\"saab\">Saab</option>\n" +
                        "  <option value=\"mercedes\">Mercedes</option>\n" +
                        "  <option value=\"audi\">Audi</option>\n" +
                        "</select> \n" +
                        "         <input type = \"submit\" value =\"Submit\" />\n" +
                        "</form> " +
                        lowerHtml();

        return selectForm;
    }


    public static String getNameInput(){
        String selectForm =
                upperHtml("Filtre") +
                        "<h3>Car Filter</h3>"+
                        "         <br />\n" +

                        " <form action = \"http://localhost:8080/serverservlet\" method = \"post\">\n" +
                        "Id: \n" +
                        "<input type = \"text\" name = \"name\" value = \"\" maxlength = \"30\" />\n" +
                        "         <br />\n" +
                        "         <br />\n" +
                        "         <input type = \"submit\" value =\"Go!\" />\n" +
                        "</form> " +
                        lowerHtml();

        return selectForm;
    }


    // Login System
    public static String getIndexPage(){
        String form = upperHtml("Servlet Login System") +
                "<h1>Welcome to Login App by Cookie</h1>  \n" +
                "<a href=\"login.html\">Login</a>  \n" +
                "<a href=\"LogoutServlet\">Logout</a>  \n" +
                "<a href=\"sessiondemo.ProfileServlet\">Profile</a>"
                + lowerHtml();
        return form;
    }

    public static String getLoginScreen(){

        String loginForm = upperHtml("Login Screen") +
                "<form action=\"/profileSession\" method=\"post\">  \n" +
                "Name:</br><input type=\"text\" name=\"name\"><br></br>  \n" +
                "Password:</br><input type=\"password\" name=\"password\"><br><br>  \n" +
                "<input type=\"hidden\" name=\"currentDate\" value='" + LocalDateTime.now() + "' ><br><br>  \n" +
                "<input type=\"submit\" value=\"login\">  \n" +
                "</form>  "
                + lowerHtml();

                return loginForm;
    }






}
