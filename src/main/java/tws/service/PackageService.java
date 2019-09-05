package tws.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tws.dao.PackageMapper;
import tws.entity.Packages;

import java.util.List;
import java.util.UUID;

@Service
public class PackageService {
    @Autowired
    PackageMapper packageMapper;
    public void addPackage(Packages packages) {
        String id=UUID.randomUUID().toString();
        packages.setKey(id);
        packageMapper.addPackage(packages);

    }

    public List<Packages> getPackageList() {
        return packageMapper.getPackageList();
    }
}
