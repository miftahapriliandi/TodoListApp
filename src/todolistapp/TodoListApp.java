/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package todolistapp;

/**
 *
 * @author Protomena
 */
public class TodoListApp {

    /**
     * @param args the command line arguments
     */

    public static String[] model = new String[10];

    public static void main(String[] args) {
        // TODO code application logic here
        // testShowTodoList();
        testAddTodoList();

    }

    // show Todo List
    public static void showTodoList(){

        for (int i = 0; i < model.length; i++) {
            String todo = model[i];
            int no = i + 1;

            if (todo != null) {
                System.out.println(no + ". " + todo);
            }
        }

    }
    
    public static void testShowTodoList(){
        model[0] = "Learn Java Basic";
        model[1] = "Study Case : TodoList App";
        showTodoList();
    }
    
    // add Todo List
    public static void addTodoList(String todo){
        // check if model is full
        Boolean isFull = true;
        for (int i = 0; i < model.length; i++) {
            if(model[i] == null){
                isFull = false;
                break;
            }
        }

        // if model full, resize array size 2x
        if(isFull){
            String[] temp = model;
            model = new String[model.length * 2];

            for (int i = 0; i < temp.length; i++) {
                model[i] = temp[i];
            }
        }

        // add to data position NULL
        for (int i = 0; i < model.length; i++) {
            if (model[i] == null) {
                model[i] = todo;
                break;
            }
        }
    }

    public static void testAddTodoList(){
        for (int i = 0; i < 25; i++) {
            addTodoList("Example Todo : " + i);
        }

        showTodoList();
    }
    
    // remove Todo from List
    public static void rmTodoList(){

    }
    
    // show view Todo list
    public static void viewShowTodoList(){
        
    }

    // show add Todo List
    public static void viewAddTodoList(){
        
    }
    
    // show remove Todo List
    public static void viewRmTodoList(){
        
    }


}
