package unsynch;

import java.util.*;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * A bank with a number of bank accounts.
 *
 * @author Cay Horstmann
 * @version 1.30 2004-08-01
 */
public class Bank {
    private final double[] accounts;
    private Lock bankLock = new ReentrantLock();
    private Condition sufficientMoney;

    /**
     * Constructs the bank.
     *
     * @param n              the number of accounts
     * @param initialBalance the initial balance for each account
     */
    public Bank(int n, double initialBalance) {
        accounts = new double[n];
        Arrays.fill(accounts, initialBalance);
        sufficientMoney = bankLock.newCondition();
    }

    /**
     * Transfers money from one account to another.
     *
     * @param from   the account to transfer from
     * @param to     the account to transfer to
     * @param amount the amount to transfer
     */
    public synchronized void transfer(int from, int to, double amount) throws InterruptedException {

        while (accounts[from] < amount) {
            // sufficientMoney.await();
            wait(); //ожидаем по единственному условию встроенной блокировки
        }
        System.out.print(Thread.currentThread());
        accounts[from] -= amount;
        System.out.printf(" %10.2f from %d to %d", amount, from, to);
        accounts[to] += amount;
        System.out.printf(" Total Balance: %10.2f%n", getTotalBalance());
        //sufficientMoney.signalAll();
        notifyAll(); //собщаем всем потокам, ожидающим по условию
    }


    /**
     * Gets the sum of all account balances.
     *
     * @return the total balance
     */
    public synchronized double getTotalBalance() {
        double sum = 0;

        for (double a : accounts)
            sum += a;

        return sum;
    }

    /**
     * Gets the number of accounts in the bank.
     *
     * @return the number of accounts
     */
    public int size() {
        return accounts.length;
    }
}
