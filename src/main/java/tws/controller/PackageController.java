package tws.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tws.entity.Packages;
import tws.service.PackageService;

import java.util.List;

@RestController
@RequestMapping("/packages")
@CrossOrigin("*")
public class PackageController {
    @Autowired
    PackageService packageService;
    @PostMapping
    public ResponseEntity addPackage(@RequestBody Packages packages) {
        packageService.addPackage(packages);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
    @GetMapping
    public ResponseEntity getPackageList(){
        List<Packages> packageList=packageService.getPackageList();
        return ResponseEntity.ok(packageList);
    }
}
