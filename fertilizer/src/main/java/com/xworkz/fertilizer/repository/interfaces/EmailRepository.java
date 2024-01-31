package com.xworkz.fertilizer.repository.interfaces;

import com.xworkz.fertilizer.entity.EmailEntity;

public interface EmailRepository {

    Integer saveMail(EmailEntity email);
}
