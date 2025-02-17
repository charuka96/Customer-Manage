package edu.icet.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.yaml.snakeyaml.scanner.ScannerImpl;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Customer {

private Integer id;
private String name;
private String email;
private String address;
private String nic;

}
