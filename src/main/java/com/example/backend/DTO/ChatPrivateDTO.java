package com.example.backend.DTO;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ChatPrivateDTO {
	private Long id;

	private Date timeSend;

	private Long IDSender;

	private String content;

	private Long IDResources;

	private Long roomPrivateID;
}
