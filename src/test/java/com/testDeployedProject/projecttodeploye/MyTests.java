package com.testDeployedProject.projecttodeploye;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.BDDMockito;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.ArgumentMatchers.anyString;

@ExtendWith({MockitoExtension.class})
public class MyTests {
    @Mock
    ProjectToDeployeApplication projectToDeployeApplication;

    @Test
    public void shouldRunMyTestMethodeSuccessfully() {
        BDDMockito.when(projectToDeployeApplication.myTestMethod()).thenReturn("TEST STRING");
        String obtained = projectToDeployeApplication.myTestMethod();
        Assertions.assertNotNull(obtained);
        Assertions.assertEquals(obtained, "TEST STRING");
    }

    @Test
    public void shouldRunMyTestMethode2Successfully() {
        BDDMockito.when(projectToDeployeApplication.myTestMethod2()).thenReturn("TEST STRING");
        String obtained = projectToDeployeApplication.myTestMethod2();
        Assertions.assertNotNull(obtained);
        Assertions.assertEquals(obtained, "TEST STRING");
    }
}
