import java.util.Scanner;
import java.text.MessageFormat;
public class Measurer
{
    // 1. Найменування приладу.
    private String name; // Gas Meter

    /* 8. Вимірювання. Прилад може бути розрахований на вимірювання декількох величин.
    Кожна з них характеризується:
        - назвою вимірюваної величини;
        - нижньою межею вимірювання;
        - верхньою межею вимірювання;
        - похибкою вимірювання.
     */
    private String unit; // m^3
    private String lowerLimit, upperLimit; // 0.000, 99999.000
    private double inaccuracy; // 0.5 - 1.5

    // 11. Стан. Може приймати значення: увімкнено, вимкнено, справний, несправний...
    private String status;

    // два конструктора ( перший – з параметрами, другий - приймає значення даних в діалоговому режимі)
    public Measurer(String name, String unit, String lowerLimit,
                    String upperLimit, double inaccuracy, String status)
    {
        this.name = name;
        this.unit = unit;
        this.lowerLimit = lowerLimit;
        this.upperLimit = upperLimit;
        this.inaccuracy = inaccuracy;
        this.status = status;
        System.out.println(MessageFormat.format("Object \"{0}\" successfully created.", this.name));
    }

    public Measurer()
    {
        setValues();
    }

    private void setValues()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nType measurer's fields, please.");
        System.out.print("Name: "); this.name = scanner.nextLine();
        System.out.print("Measuring unit: "); this.unit = scanner.nextLine();
        System.out.print("Lower limit: "); this.lowerLimit = scanner.nextLine();
        System.out.print("Upper limit: "); this.upperLimit = scanner.nextLine();
        System.out.print("Inaccuracy: "); this.inaccuracy = Double.parseDouble(scanner.nextLine());
        System.out.print("Status: "); this.status = scanner.nextLine();
        System.out.println(MessageFormat.format("Object \"{0}\" successfully created.", this.name));
    }

    // методи зміни та отримання даних, що представляють властивості приладу;
    public void getListing()
    {
        System.out.println("Name: " + name);
        System.out.println("Measuring unit: " + unit);
        System.out.println("Lower limit: " + lowerLimit);
        System.out.println("Upper limit: " + upperLimit);
        System.out.println("Inaccuracy: " + inaccuracy);
        System.out.println("Status: " + status);
    }

    public void setName(String name)
    {
        System.out.println(MessageFormat.format("Name of \"{0}\" was changed to \"{1}\".", this.name, name));
        this.name = name;

    }

    public String getName()
    {
        return name;
    }

    public void setUnit(String unit)
    {
        System.out.println(MessageFormat.format("Unit of \"{0}\" was changed from \"{1}\" to \"{2}\".",
                this.name, this.unit, unit));
        this.unit = unit;
    }

    public String getUnit()
    {
        return unit;
    }

    public void setLowerLimit(String lowerLimit)
    {
        System.out.println(MessageFormat.format("Lower limit of \"{0}\" was changed from \"{1}\" to \"{2}\".",
                this.name, this.lowerLimit, lowerLimit));
        this.lowerLimit = lowerLimit;
    }

    public String getLowerLimit()
    {
        return lowerLimit;
    }

    public void setUpperLimit(String upperLimit)
    {
        System.out.println(MessageFormat.format("Upper limt of \"{0}\" was changed from \"{1}\" to \"{2}\".",
                this.name, this.upperLimit, upperLimit));
        this.upperLimit = upperLimit;
    }

    public String getUpperLimit()
    {
        return upperLimit;
    }

    public void setInaccuracy(double inaccuracy)
    {
        System.out.println(MessageFormat.format("Inaccuracy of \"{0}\" was changed from \"{1}\" to \"{2}\".",
                this.name, this.inaccuracy, inaccuracy));
        this.inaccuracy = inaccuracy;
    }

    public double getInaccuracy()
    {
        return inaccuracy;
    }

    // методи, що керують станом приладу.
    public void setStatus(String status)
    {
        System.out.println(MessageFormat.format("Status of \"{0}\" was changed from \"{1}\" to \"{2}\".",
                this.name, this.status, status));
        this.status = status;
    }

    public String getStatus()
    {
        return status;
    }


}
