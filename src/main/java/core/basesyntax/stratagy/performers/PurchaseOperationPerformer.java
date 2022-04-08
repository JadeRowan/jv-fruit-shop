package core.basesyntax.stratagy.performers;

import core.basesyntax.model.FruitTransaction;
import core.basesyntax.service.StorageDao;

public class PurchaseOperationPerformer implements core.basesyntax.stratagy.OperationPerformer {
    @Override
    public void perform(StorageDao storageDao, FruitTransaction transaction) {
        storageDao.reduce(transaction.getFruit(), transaction.getQuantity());
    }
}
