package com.checkout.sdk.payments.source;

import com.checkout.sdk.common.AccountHolder;
import com.checkout.sdk.common.AccountType;
import com.checkout.sdk.payments.RequestSource;
import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BankAccountSource implements RequestSource {
    public static final String TYPE_NAME = "bank_account";

    @SerializedName("type")
    private final String type = TYPE_NAME;

    @SerializedName("payment_method")
    private String paymentMethod;

    @SerializedName("account_type")
    private AccountType accountType;

    private String country;

    @SerializedName("account_number")
    private String accountNumber;

    @SerializedName("bank_code")
    private String bankCode;

    @SerializedName("account_holder")
    private AccountHolder accountHolder;

    @Override
    public String getType() {
        return TYPE_NAME;
    }
}
