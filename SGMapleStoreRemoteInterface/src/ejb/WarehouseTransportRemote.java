package ejb;

import java.util.List;
import java.util.Vector;
import javax.ejb.Remote;
import java.util.ArrayList;

@Remote
public interface WarehouseTransportRemote {
    public List<Vector> getItemListingNames();
    public boolean createInventoryLog(String userNRIC, String logDate, String logReason, String logDescription, 
            String[] itemNameArr, String[] itemSKUArr, String[] itemQtyArr, String[] itemQtyAdjustArr);
    public List<Vector> viewInventoryLogList();
    public boolean createCompositeItem(String compositeName, String compositeSKU, String compositeSellPrice, 
            String compositeRebundleLvl,  String compositeDescription, String fileName, String[] itemNameArr, 
            String[] itemSKUArr, String[] itemQtyRequiredArr);
    public List<Vector> viewCompositeItemList();
    public List<Vector> viewInvoiceList();
<<<<<<< HEAD
<<<<<<< refs/remotes/Winston/master
    public boolean createInventoryCategory(String newCategoryName,String newCategoryDesc,ArrayList<String> sCats);
    public List<Vector> viewAllInventoryCategories();
    public void modifyInventoryCategory(String categoryName,String updatedCategoryDesc,ArrayList<String> sCats);
=======

    public boolean createInvoice(String status, String contactUsername, String paymentReferenceNum, String paymentMode, String discountAmt, String shippingAmt);
>>>>>>> Update to latest changes
=======

    public boolean createInvoice(String status, String contactUsername, String paymentReferenceNum, String paymentMode, String discountAmt, String shippingAmt);
>>>>>>> master
}