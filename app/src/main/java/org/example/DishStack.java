package org.example;

public class DishStack {
    private Dish[] stackArray;
    private int top;
    private int capacity;

    public DishStack(int size) {
        stackArray = new Dish[size];
        capacity = size;
        top = -1;
    }

    public void push(Dish dish) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push " + dish + ".");
            return;
        }
        stackArray[++top] = dish;
    }

    public Dish pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return null;
        }
        return stackArray[top--];
    }

    public Dish peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Nothing to peek.");
            return null;
        }
        return stackArray[top];
    }

    public int size() {
        return top + 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }
}
