package com.checkout.sdk.payments;

import com.checkout.sdk.common.Address;
import com.checkout.sdk.common.Phone;
import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ShippingDetails {
    private Address address;
    private Phone phone;
    @SerializedName("from_address_zip")
    private String fromAddressZip;
}