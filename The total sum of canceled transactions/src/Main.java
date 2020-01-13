/**
 * Calculates the general sum of canceled transactions for all non empty accounts in the list
 */
public static long calcSumOfCanceledTransOnNonEmptyAccounts(List<Account> accounts) {

        return accounts.stream()
        .filter(x -> x.getBalance() > 0)
        .flatMap(account -> account.getTransactions().stream())
        .filter(transaction ->transaction.getState()==State.CANCELED)
        .mapToLong(x -> x.getSum())
        .sum();
        }