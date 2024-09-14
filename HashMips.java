import java.util.*;

public class HashMips {
    private Map<String, Object> instrucoes;

    public HashMips() {
        instrucoes = new HashMap<>();
    // Instruções de leitura e escrita
    instrucoes.put("lb", "read");
    instrucoes.put("lh", "read");
    instrucoes.put("lwl", "read");
    instrucoes.put("lw", "read");
    instrucoes.put("lbu", "read");
    instrucoes.put("lhu", "read");
    instrucoes.put("lwr", "read");

    instrucoes.put("sb", "write");
    instrucoes.put("sh", "write");
    instrucoes.put("swl", "write");
    instrucoes.put("sw", "write");
    instrucoes.put("swr", "write");

    // Instruções de leitura e escrita (aritméticas)
    instrucoes.put("add", Arrays.asList("read", "write"));
    instrucoes.put("addu", Arrays.asList("read", "write"));
    instrucoes.put("sub", Arrays.asList("read", "write"));
    instrucoes.put("subu", Arrays.asList("read", "write"));
    instrucoes.put("and", Arrays.asList("read", "write"));
    instrucoes.put("or", Arrays.asList("read", "write"));
    instrucoes.put("xor", Arrays.asList("read", "write"));
    instrucoes.put("nor", Arrays.asList("read", "write"));
    instrucoes.put("slt", Arrays.asList("read", "write"));
    instrucoes.put("sltu", Arrays.asList("read", "write"));

    // Instruções de leitura e escrita (imediadas)
    instrucoes.put("addi", Arrays.asList("read", "write"));
    instrucoes.put("addiu", Arrays.asList("read", "write"));
    instrucoes.put("slti", Arrays.asList("read", "write"));
    instrucoes.put("sltiu", Arrays.asList("read", "write"));
    instrucoes.put("andi", Arrays.asList("read", "write"));
    instrucoes.put("ori", Arrays.asList("read", "write"));
    instrucoes.put("xori", Arrays.asList("read", "write"));
    instrucoes.put("lui", "read");

    // Instruções de escrita (deslocamento)
    instrucoes.put("sll", "write");
    instrucoes.put("srl", "write");
    instrucoes.put("sra", "write");
    instrucoes.put("sllv", "write");
    instrucoes.put("srlv", "write");
    instrucoes.put("srav", "write");

    // Instruções de leitura (HI/LO)
    instrucoes.put("mfhi", "read");
    instrucoes.put("mthi", "read");
    instrucoes.put("mflo", "read");
    instrucoes.put("mtlo", "read");
    instrucoes.put("mult", "read");
    instrucoes.put("multu", "read");
    instrucoes.put("div", "read");
    instrucoes.put("divu", "read");

    // Instruções de leitura (salto)
    instrucoes.put("jr", "read");
    instrucoes.put("jalr", "read");

    // Instruções de leitura (condicionais)
    instrucoes.put("bltz", "read");
    instrucoes.put("bgez", "read");
    instrucoes.put("bltzal", "read");
    instrucoes.put("bgezal", "read");
    instrucoes.put("beq", "read");
    instrucoes.put("bne", "read");
    instrucoes.put("blez", "read");
    instrucoes.put("bgtz", "read");

    // Instruções de leitura (salto incondicional)
    instrucoes.put("j", "read");
    instrucoes.put("jal", "read");

    }

    public Object getRegister(String key){
        return instrucoes.get(key);
    }
   
}