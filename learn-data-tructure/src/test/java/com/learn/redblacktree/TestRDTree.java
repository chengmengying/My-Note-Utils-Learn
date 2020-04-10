package com.learn.redblacktree;

import org.junit.Test;

/**
 * @author xiaosha
 * @create 2018-12-10 11:02
 */
public class TestRDTree {

    RBTree<Integer> tree = new RBTree<Integer>();

    private void insertAndPrint(Integer key){
        tree.insert(key);
        System.out.println("\n=-> ��������"+key+"�󣬴�ʱ���������Ϣ:");
        tree.print();
    }

    private void removeAndPrint(Integer key){
        tree.remove(key);
        System.out.println("\n=-> ɾ������"+key+"�󣬴�ʱ���������Ϣ:");
        tree.print();
    }

    private void searchAndPrint(Integer key){
        System.out.print("\n ==->��ѯ"+key+"�Ľ���ǣ�");
        RBTNode result = tree.search(key);
        System.out.println(result);
        if(tree.search(key) == null){
            System.out.println("'��ѯ�޹���'");
        }else{
            //RED == false    true == Black
            if(result.color == false){
                System.out.println(" ��ɫ��������"+result.left+" �Һ�����"+result.right+" ����ϵ�ڵ���"+result.parent);
            }
            if(result.color == true){
                System.out.println(" ��ɫ��������"+result.left+" �Һ�����"+result.right+" ����ϵ�ڵ���"+result.parent);
            }
        }
    }


    @Test
    public void test01(){

        //���Բ������ݣ�
        insertAndPrint(20);
        insertAndPrint(26);
        insertAndPrint(18);
        insertAndPrint(9);
        insertAndPrint(15);
        insertAndPrint(46);
        insertAndPrint(28);
        insertAndPrint(3);
        insertAndPrint(10);
        insertAndPrint(22);
        insertAndPrint(61);
        System.out.println("\n========================================================================\n\n");

        //���Ա���
        System.out.printf("\n=====---> ǰ�����: ");
        tree.preOrder();
        System.out.printf("\n=====---> �������: ");
        tree.inOrder();
        System.out.printf("\n=====---> �������: ");
        tree.postOrder();
        System.out.println("\n========================================================================\n\n");

        //Ѱ�������Сֵ
        System.out.printf("\n=====---> ��Сֵ: %s\n", tree.minimum());
        System.out.printf("=====---> ���ֵ: %s\n", tree.maximum());
        System.out.println("========================================================================\n\n");


        //����ɾ������
        removeAndPrint(22);
        removeAndPrint(46);
        removeAndPrint(20);
        System.out.println("========================================================================\n\n");


        //���Բ���
        searchAndPrint(22);
        searchAndPrint(18);
        searchAndPrint(9);
        searchAndPrint(10);
        searchAndPrint(28);

    }
}
