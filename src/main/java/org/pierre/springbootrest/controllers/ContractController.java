package org.pierre.springbootrest.controllers;

import org.pierre.springbootrest.dto.Contract;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(ContractController.CONTRACT_BASE_URI)
public class ContractController {
    public static final String CONTRACT_BASE_URI = "svc/v1/contract";

    @RequestMapping(value = "{contractNumber}")
    public Contract getContract(@PathVariable final int contractNumber) {
        Contract contract = new Contract();
        contract.setName("pierre");
        contract.setId(contractNumber);
        return contract;
    }

}
