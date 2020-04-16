package br.com.gabrielvieira.oshiteste;

import oshi.SystemInfo;
import oshi.hardware.*;
import oshi.software.os.OSProcess;
import oshi.software.os.OSService;
import oshi.software.os.OperatingSystem;

public class Teste {
    public static void main(String[] args) throws InterruptedException {
        SystemInfo si = new SystemInfo();
        OperatingSystem os = si.getOperatingSystem();
        HardwareAbstractionLayer hal = si.getHardware();
//        teste1(hal.getProcessor());
        CentralProcessor processor = hal.getProcessor();



//        OSService[] services = teste.getOperatingSystem().getServices();
//        System.out.println(services[0].getProcessID());


//        SoundCard[] som = teste.getHardware().getSoundCards();
//        System.out.println(som[0]);
//        ComputerSystem sistema = teste.getHardware().getComputerSystem();
//        System.out.println(sistema);


//        NetworkIF[] wifi = teste.getHardware().getNetworkIFs();
//        System.out.println(wifi[0].toString());
//        Display[] telas = teste.getHardware().getDisplays();
//        HWDiskStore[] cd_rom = teste.getHardware().getDiskStores();
//        System.out.println(cd_rom[0]);
//        System.out.println("========= Info do Computador =========");
//        System.out.println(String.format("Processador: %s",processador));
        System.out.println(String.format("Sistema Operacional: %s", si.getOperatingSystem()));
//        System.out.println("Frequencia Maxima:" + teste.getHardware().getProcessor().getMaxFreq());
//        System.out.println("Freq. Processador: " + processadores[0]/1000000000.0 + " GHz");
//        System.out.println("Versão do Sistema Operacional: " + versaoSO);
//        System.out.println(teste.getOperatingSystem().getThreadCount());


//        OSProcess[] listaProcessos = teste.getOperatingSystem().getProcesses();
//
//        for (OSProcess processos: listaProcessos){
//            System.out.println(processos.getName());
//        }

//        PowerSource[] bateria = teste.getHardware().getPowerSources();
//        Sensors sensors = teste.getHardware().getSensors();
//        System.out.println(sensors);
//        System.out.println(bateria[0]);

//        System.out.println("====== Estado Atual ======");
//        for (Integer i = 0; i < 5; i ++ ) {
//            System.out.println("Processos Ativos: " + processosAtivos);
//            double memoriaTotal = teste.getHardware().getMemory().getTotal() / 1000000000.0;
//            double memoriaSobrando = (teste.getHardware().getMemory().getAvailable() / 1000000000.0) * 100/memoriaTotal;
//            double memoriaUtilizada = 100 - memoriaSobrando;
//            System.out.println(String.format("Memória Total:%.3f Gb",memoriaTotal));
//            System.out.println(String.format("Memória Utilizada:%.3f %%",memoriaUtilizada));
//            System.out.println(String.format("Memória Restante:%.3f %%",memoriaSobrando));


//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }

//        }
    }

//    public static void teste1(CentralProcessor processor) throws InterruptedException {
//
//        long[] ticks = processor.getSystemCpuLoadTicks();
//        Thread.sleep(1000);
//        long[] prevTicks = processor.getSystemCpuLoadTicks();
//        long[][] prevProcTicks = processor.getProcessorCpuLoadTicks();
//        long user = ticks[CentralProcessor.TickType.USER.getIndex()] - prevTicks[CentralProcessor.TickType.USER.getIndex()];
//        long nice = ticks[CentralProcessor.TickType.NICE.getIndex()] - prevTicks[CentralProcessor.TickType.NICE.getIndex()];
//        long sys = ticks[CentralProcessor.TickType.SYSTEM.getIndex()] - prevTicks[CentralProcessor.TickType.SYSTEM.getIndex()];
//        long idle = ticks[CentralProcessor.TickType.IDLE.getIndex()] - prevTicks[CentralProcessor.TickType.IDLE.getIndex()];
//        long iowait = ticks[CentralProcessor.TickType.IOWAIT.getIndex()] - prevTicks[CentralProcessor.TickType.IOWAIT.getIndex()];
//        long irq = ticks[CentralProcessor.TickType.IRQ.getIndex()] - prevTicks[CentralProcessor.TickType.IRQ.getIndex()];
//        long softirq = ticks[CentralProcessor.TickType.SOFTIRQ.getIndex()] - prevTicks[CentralProcessor.TickType.SOFTIRQ.getIndex()];
//        long steal = ticks[CentralProcessor.TickType.STEAL.getIndex()] - prevTicks[CentralProcessor.TickType.STEAL.getIndex()];
//        long totalCpu = user + nice + sys + idle + iowait + irq + softirq + steal;
//        System.out.println(String.format(
//                "User: %.1f%% Nice: %.1f%% System: %.1f%% Idle: %.1f%% IOwait: %.1f%% IRQ: %.1f%% SoftIRQ: %.1f%% Steal: %.1f%%",
//                100d * user / totalCpu, 100d * nice / totalCpu, 100d * sys / totalCpu, 100d * idle / totalCpu,
//                100d * iowait / totalCpu, 100d * irq / totalCpu, 100d * softirq / totalCpu, 100d * steal / totalCpu));
//        System.out.println(String.format("CPU load: %.1f%%", processor.getSystemCpuLoadBetweenTicks(prevTicks) * 100));
//        double[] loadAverage = processor.getSystemLoadAverage(3);
//        System.out.println(("CPU load averages:" + (loadAverage[0] < 0 ? " N/A" : String.format(" %.2f", loadAverage[0]))
//                + (loadAverage[1] < 0 ? " N/A" : String.format(" %.2f", loadAverage[1]))
//                + (loadAverage[2] < 0 ? " N/A" : String.format(" %.2f", loadAverage[2]))));
//    }
    }
