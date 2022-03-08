package com.company;

import java.util.PriorityQueue;

public class DemandSupplyOrder {

    public static void main(String[] args) {
	// write your code here
        intQ.add(24);
        intQ.offer(90);
        intQ.add(110);
        intQ.add(10);
        intQ.add(40);
        intQ.offer(50);
        intQ.offer(90);
        intQ.add(20);
        intQ.add(10);
        intQ.add(10);

        System.out.println("Elements in this queue are: ");
        System.out.println(intQ);

        // printing size of the queue
        System.out.println("Size of this queue is: " + intQ.size());

        // removing values based on priority and printing them
        System.out.println("Priority Queue:");
        while(!intQ.isEmpty()){
            System.out.println(intQ.remove());

            class DemandOrder<demand> implements Comparable<DemandOrder> {
                private int orderId;
                private int supplyorderId;
                private double price;
                private double quantity;
                private demand order;

                public void DemandOrder(demand order-Id, price, quantity) {
                    this.order = order;
                    this.order = order;
                    this.demandId = demandId;
                    this.supplyorderId = supplyorderId;
                    this.price = price;
                    this.quantity = quantity;
                }

                @Override
                public int compareTo(DemandOrder o) {
                    return o.orderId > this.orderId ? 1 : -1;
                }

                @Override
                public String toString() {
                    return "orderId:" + this.orderId + ", demandId:" + this.supplyorderId + ", price:" + quantity;
                }

                public double getOrderId() {
                    return orderId;
                }
            }

            SupplyOrder s1 = new SupplyOrder(1, 100.0, "customer1");
            SupplyOrder s2 = new SupplyOrder(3, 50.0, "customer3");
            SupplyOrder s3 = new SupplyOrder(2, 300.0, "customer2");

            Queue<CustomerOrder> customerOrders = new PriorityQueue<>();
            SupplyOrders.add(c1);
            SupplyOrders.add(c2);
            SupplyOrders.add(c3);
            while (!customerOrders.isEmpty()) {
                System.out.println(customerOrders.poll());
            }
            Queue<CustomerOrder> customerOrders = new PriorityQueue<>(new CustomerOrderComparator());
        }
    }
}
