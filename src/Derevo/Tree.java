package Derevo;

import javax.swing.*;
import java.util.Stack;

public class Tree {
    private Node root;
    public Node find(int key){
        Node current=root;
        while(current.iData!=key)
        {
            if (key< current.iData)
                current=current.leftChild;
            else
                current=current.richtChild;
            if (current==null)
                return null;
        }
        return current;
    }
    public void insert(int id, double dd){
        Node newNode=new Node();
        newNode.iData=id;
        newNode.fData=dd;
        if (root==null)
            root=newNode;
        else
        {
            Node current=root;
            Node parent;
            while(true)
            {
                parent=current;
                if (id< current.iData)
                {
                    current=current.leftChild;
                    if (current==null) {
                        parent.leftChild = newNode;
                        return;
                    }
                }
                else
                {
                    current=current.richtChild;
                    if (current==null)
                    {
                        parent.richtChild=newNode;
                        return;
                    }
                }
            }
        }
    }
    public boolean delete (int key) {
        Node current = root;
        Node parent = root;
        boolean isLeftChild = true;

        while (current.iData != key) {
            parent=current;
            if (key < current.iData) {
                isLeftChild = true;
                current = current.leftChild;
            } else
            {
                isLeftChild = false;
                current = current.richtChild;
            }
            if (current == null)
                return false;

        }
        if (current.leftChild == null && current.richtChild == null) {
            if (current == root)
                root = null;
            else if (isLeftChild)
                parent.leftChild = null;
            else
                parent.richtChild = null;
        }else if (current.richtChild==null) {
            if (current == root)
                root = current.leftChild;
            else if (isLeftChild) {
                parent.leftChild = current.leftChild;
            } else
                parent.richtChild = current.leftChild;
        } else if (current.leftChild==null) {
            if (current==root)
                root=current.richtChild;
            else if (isLeftChild)
                parent.leftChild=current.richtChild;
            else
                parent.richtChild=current.richtChild;
        }else
        {
            Node successor=getSuccessor(current);
            if (current==root)
                root=successor;
            else if (isLeftChild)
                parent.leftChild=successor;
            else
                parent.richtChild=successor;
            successor.leftChild=current.leftChild;
        }
        return true;
    }
    private  Node getSuccessor(Node delNode)
    {
        Node successorParent=delNode;
        Node successor=delNode;
        Node current=delNode.richtChild;
        while (current!=null)
        {
            successorParent=successor;
            successor=current;
            current=current.leftChild;
        }
        if (successor!=delNode.richtChild)
        {
            successorParent.leftChild=successor.richtChild;
            successor.richtChild=delNode.richtChild;
        }
        return successor;
    }
    private void inOrder(Node localRoot)//симметричный обход
    {
        if (localRoot!=null)
        {
            inOrder(localRoot.leftChild);
            System.out.print(localRoot.iData+" ");
            inOrder(localRoot.richtChild);
        }
    }
    public void displayTree()
    {
        Stack globalStack= new Stack();
        globalStack.push(root);
        int nBlans=32;
        boolean isRowEmpty=false;
        System.out.println("...........................");
        while (isRowEmpty==false)
        {
            Stack lockalStack=new Stack<>();
            isRowEmpty=true;
            for (int j=0; j<nBlans; j++)
                System.out.print(' ');
            while (globalStack.isEmpty()==false)
            {
                Node temp=(Node)globalStack.pop();
                if (temp!=null)
                {
                    System.out.print(temp.iData);
                    lockalStack.push(temp.leftChild);
                    lockalStack.push(temp.richtChild);
                    if (temp.leftChild!=null||temp.richtChild!=null)
                        isRowEmpty=false;
                }
                else
                {
                    System.out.print("--");
                    lockalStack.push(null);
                    lockalStack.push(null);
                }
                for (int j=0; j<nBlans*2-2; j++)
                    System.out.print(' ');
            }
            System.out.println();
            nBlans/=2;
            while (lockalStack.isEmpty()==false)
                globalStack.push(lockalStack.pop());
        }
        System.out.println(".................................");
    }
}
