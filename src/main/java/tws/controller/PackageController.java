package tws.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tws.entity.Packages;
import tws.service.PackageService;

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
}
