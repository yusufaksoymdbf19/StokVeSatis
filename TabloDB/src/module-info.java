module TabloDB {
	requires javafx.controls;
	requires javafx.fxml;
	requires java.sql;
	requires javafx.base;
	requires javafx.graphics;
	requires java.xml;
	opens application to javafx.graphics, javafx.fxml, javafx.base;
}
