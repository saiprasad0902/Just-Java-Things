package com.prasad.learnings.datastructures;

public class LinkedList {
    Node head;

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }

    public static LinkedList insert(LinkedList list, int data){
        Node node = new Node(data);
        node.next = null;

        if(list.head == null){
            list.head = node;
        }else{
            Node lastNode = list.head;
            while (lastNode.next!=null){
                lastNode = lastNode.next;
            }

            lastNode.next = node;
        }
        return  list;
    }

    public static void PrintList(LinkedList list){
        Node currentNode = list.head;
        while (currentNode!=null){
            System.out.println(currentNode.data + "");
            currentNode = currentNode.next;

        }
    }

    public static LinkedList DeleteNodeByKey(LinkedList list, int key){
        Node currentNode = list.head, prev = null;

        // head has the value
        if(currentNode != null && currentNode.data == key){
            list.head = currentNode.next;
            System.out.println("Deleted");
            return list;
        }


        while(currentNode != null && currentNode.data != key){
            prev = currentNode;
            currentNode = currentNode.next;
        }

        if(currentNode != null){
            prev.next = currentNode.next;
        }
        return list;
    }





    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list = insert(list,1);
        list = insert(list , 2);


        PrintList(list);

    }


}
