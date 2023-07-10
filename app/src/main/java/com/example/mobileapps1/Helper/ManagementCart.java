package com.example.mobileapps1.Helper;

import android.content.Context;
import android.widget.Toast;

import com.example.mobileapps1.Interface.ChangeNumberItemsListener;
import com.example.mobileapps1.models.Domain.ProdDomain;

import java.util.ArrayList;

public class ManagementCart {
    private Context context;
    private TinyDB tinyDB;


    public ManagementCart(Context context) {
        this.context = context;
        this.tinyDB = new TinyDB(context);
    }
    public void insertProd(ProdDomain item){
        ArrayList<ProdDomain> listProd=getListCart();
                boolean existAlready=false;
                int n=0;
                for (int i = 0; i <listProd.size() ; i++){
                    if (listProd.get(i).getTitle().equals(item.getTitle())) {
                        existAlready=true;
                        n=i;
                        break;
                    }
                }
                if (existAlready){
                    listProd.get(n).setNumberInCart(item.getNumberInCart());

                }else {
                    listProd.add(item);
                }
                tinyDB.putListObject("CartList",listProd);
        Toast.makeText(context, "Added To Your Cart", Toast.LENGTH_SHORT).show();
    }

    public ArrayList<ProdDomain> getListCart(){
        return tinyDB.getListObject("CartList");
    }

    public void plusNumberProd(ArrayList<ProdDomain>listProd, int position, ChangeNumberItemsListener changeNumberItemsListener ){
        listProd.get(position).setNumberInCart(listProd.get(position).getNumberInCart()+1);
        tinyDB.putListObject("Cart List", listProd);
        changeNumberItemsListener.changed();

    }
    public void minusNumberProd(ArrayList<ProdDomain> listprod,int position, ChangeNumberItemsListener changeNumberItemsListener){
        if(listprod.get(position).getNumberInCart()==1){
            listprod.remove(position);
        }else {
            listprod.get(position).setNumberInCart(listprod.get(position).getNumberInCart()-1);
        }
        tinyDB.putListObject("CartList", listprod);
        changeNumberItemsListener.changed();
    }

    public Double getTotalFee(){
        ArrayList<ProdDomain> listprod=getListCart();
        double fee=0;
        for (int i = 0; i < listprod.size(); i++) {
            fee=fee+(listprod.get(i).getFee()*listprod.get(i).getNumberInCart());
        }
        return fee;
    }
}
