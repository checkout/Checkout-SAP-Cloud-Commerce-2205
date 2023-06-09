package com.checkout.sdk.payments.sender;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public final class PaymentInstrumentSender extends PaymentSender {

    @Builder
    private PaymentInstrumentSender(final String reference) {
        super(SenderType.INSTRUMENT, reference);
    }

    public PaymentInstrumentSender() {
        super(SenderType.INSTRUMENT);
    }

}
