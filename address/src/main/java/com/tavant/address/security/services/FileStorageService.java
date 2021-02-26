package com.tavant.address.security.services;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartFile;

import com.tavant.address.models.Address;
import com.tavant.address.models.File;
import com.tavant.address.models.Response;
import com.tavant.address.repository.AddressRepository;
import com.tavant.address.repository.FileRepository;

@Service
public class FileStorageService {

	@Autowired
	private FileRepository fileRepository;

	@Autowired
	AddressRepository addressRepository;

	public File store(MultipartFile file) throws IOException {
		String fileName = StringUtils.cleanPath(file.getOriginalFilename());
		File File1 = new File(fileName, file.getContentType(), file.getBytes());

		String s = new String(File1.getData(), StandardCharsets.UTF_8);
		System.out.println(s);

		String[] a = s.split("\\n");
		try {
			for (String i : a) {
				System.out.println("Inside");
				String[] Array2 = i.split(",");
				System.out.println("outside address creation");
				Address address = new Address();
				System.out.println("inside address creation");
				System.out.println(address);
				address.setHouseNumber(Array2[0]);
				System.out.println("inside address creation");
				address.setHouseName(Array2[1]);
				System.out.println("inside address creation");
				address.setPoi(Array2[2]);
				System.out.println("inside address creation");
				address.setStreet(Array2[3]);
				System.out.println("inside address creation");
				address.setSubSubLocality(Array2[4]);
				System.out.println("inside address creation");
				address.setSubLocality(Array2[5]);
				System.out.println("inside address creation");
				address.setLocality(Array2[6]);
				System.out.println("inside address creation");
				address.setVillage(Array2[7]);
				System.out.println("inside address creation");
				address.setSubDistrict(Array2[8]);
				System.out.println("inside address creation");
				address.setDistrict(Array2[9]);
				System.out.println("inside address creation");
				address.setCity(Array2[10]);
				System.out.println("inside address creation");
				address.setState(Array2[11]);
				System.out.println("inside address creation");
				address.setPincode(Array2[12]);
				System.out.println("inside address creation");
				address.setFormattedAddress(Array2[13]);
				System.out.println("inside address creation");
				address.setELoc(Array2[14]);
				System.out.println("inside address creation");
				address.setGeocodeLevel(Array2[15]);
				System.out.println("inside address creation");
				System.out.println(address);
				address.setConfidenceScore(23.0f);
				System.out.println(address);
				//			addressRepository.save(address);
				System.out.println(address);
				boolean bool = Validate(address);
				System.out.println(bool);
				if(bool==true) {
					addressRepository.save(address);
				}
			}
		}
		catch(Exception e){
			e.printStackTrace();

		}

		return null;
	}

	public boolean Validate(Address address) {

		System.out.println(address.getELoc());
		String variable = address.getELoc().replaceAll("\\s", "");
		String var = String.format("http://apis.mapmyindia.com/advancedmaps/v1/dy7j74icxocriuq1xrrn7epcod8hahcn/place_detail?place_id=%s",variable);
		System.out.println(var);
		RestTemplate rest = new RestTemplate();
		Response response =rest.getForObject(var, Response.class);
		System.out.println("outside if");
		if(response.getResponseCode()==200 && response.getResults().size()!=0) {
			System.out.println("inside If");

			return true;
		}
		else {
			System.out.println("inside else");
			System.out.println(response.getResponseCode());
			return false;
		}


	}
	public File getFile(String id) {
		return fileRepository.findById(id).get();
	}

	public Stream<File> getAllFiles() {
		return fileRepository.findAll().stream();
	}
}
