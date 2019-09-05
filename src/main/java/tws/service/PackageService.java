package tws.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tws.dao.PackageMapper;
import tws.entity.Packages;

@Service
public class PackageService {
    @Autowired
    PackageMapper packageMapper;
    public void addPackage(Packages packages) {
        packageMapper.addPackage(packages);

    }
}
