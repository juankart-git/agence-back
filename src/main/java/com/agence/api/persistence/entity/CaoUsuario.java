package com.agence.api.persistence.entity;

import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.Instant;
import java.time.LocalDate;

@Entity
@Table(name = "cao_usuario")
public class CaoUsuario implements Serializable {
    @Id
    @Column(name = "co_usuario", nullable = false, length = 20)
    private String id;

    @Column(name = "no_usuario", nullable = false, length = 50)
    private String noUsuario;

    @Column(name = "ds_senha", nullable = false, length = 14)
    private String dsSenha;

    @Column(name = "co_usuario_autorizacao", length = 20)
    private String coUsuarioAutorizacao;

    @Column(name = "nu_matricula")
    private Long nuMatricula;

    @Column(name = "dt_nascimento")
    private LocalDate dtNascimento;

    @Column(name = "dt_admissao_empresa")
    private LocalDate dtAdmissaoEmpresa;

    @Column(name = "dt_desligamento")
    private LocalDate dtDesligamento;

    @Column(name = "dt_inclusao")
    private Instant dtInclusao;

    @Column(name = "dt_expiracao")
    private LocalDate dtExpiracao;

    @Column(name = "nu_cpf", length = 14)
    private String nuCpf;

    @Column(name = "nu_rg", length = 20)
    private String nuRg;

    @Column(name = "no_orgao_emissor", length = 10)
    private String noOrgaoEmissor;

    @Column(name = "uf_orgao_emissor", length = 2)
    private String ufOrgaoEmissor;

    @Column(name = "ds_endereco", length = 150)
    private String dsEndereco;

    @Column(name = "no_email", length = 100)
    private String noEmail;

    @Column(name = "no_email_pessoal", length = 100)
    private String noEmailPessoal;

    @Column(name = "nu_telefone", length = 64)
    private String nuTelefone;

    @Column(name = "dt_alteracao", nullable = false)
    private Instant dtAlteracao;

    @Column(name = "url_foto")
    private String urlFoto;

    @Column(name = "instant_messenger", length = 80)
    private String instantMessenger;

    @Column(name = "icq", columnDefinition = "INT UNSIGNED")
    private Long icq;

    @Column(name = "msn", length = 50)
    private String msn;

    @Column(name = "yms", length = 50)
    private String yms;

    @Column(name = "ds_comp_end", length = 50)
    private String dsCompEnd;

    @Column(name = "ds_bairro", length = 30)
    private String dsBairro;

    @Column(name = "nu_cep", length = 10)
    private String nuCep;

    @Column(name = "no_cidade", length = 50)
    private String noCidade;

    @Column(name = "uf_cidade", length = 2)
    private String ufCidade;

    @Column(name = "dt_expedicao")
    private LocalDate dtExpedicao;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNoUsuario() {
        return noUsuario;
    }

    public void setNoUsuario(String noUsuario) {
        this.noUsuario = noUsuario;
    }

    public String getDsSenha() {
        return dsSenha;
    }

    public void setDsSenha(String dsSenha) {
        this.dsSenha = dsSenha;
    }

    public String getCoUsuarioAutorizacao() {
        return coUsuarioAutorizacao;
    }

    public void setCoUsuarioAutorizacao(String coUsuarioAutorizacao) {
        this.coUsuarioAutorizacao = coUsuarioAutorizacao;
    }

    public Long getNuMatricula() {
        return nuMatricula;
    }

    public void setNuMatricula(Long nuMatricula) {
        this.nuMatricula = nuMatricula;
    }

    public LocalDate getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(LocalDate dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public LocalDate getDtAdmissaoEmpresa() {
        return dtAdmissaoEmpresa;
    }

    public void setDtAdmissaoEmpresa(LocalDate dtAdmissaoEmpresa) {
        this.dtAdmissaoEmpresa = dtAdmissaoEmpresa;
    }

    public LocalDate getDtDesligamento() {
        return dtDesligamento;
    }

    public void setDtDesligamento(LocalDate dtDesligamento) {
        this.dtDesligamento = dtDesligamento;
    }

    public Instant getDtInclusao() {
        return dtInclusao;
    }

    public void setDtInclusao(Instant dtInclusao) {
        this.dtInclusao = dtInclusao;
    }

    public LocalDate getDtExpiracao() {
        return dtExpiracao;
    }

    public void setDtExpiracao(LocalDate dtExpiracao) {
        this.dtExpiracao = dtExpiracao;
    }

    public String getNuCpf() {
        return nuCpf;
    }

    public void setNuCpf(String nuCpf) {
        this.nuCpf = nuCpf;
    }

    public String getNuRg() {
        return nuRg;
    }

    public void setNuRg(String nuRg) {
        this.nuRg = nuRg;
    }

    public String getNoOrgaoEmissor() {
        return noOrgaoEmissor;
    }

    public void setNoOrgaoEmissor(String noOrgaoEmissor) {
        this.noOrgaoEmissor = noOrgaoEmissor;
    }

    public String getUfOrgaoEmissor() {
        return ufOrgaoEmissor;
    }

    public void setUfOrgaoEmissor(String ufOrgaoEmissor) {
        this.ufOrgaoEmissor = ufOrgaoEmissor;
    }

    public String getDsEndereco() {
        return dsEndereco;
    }

    public void setDsEndereco(String dsEndereco) {
        this.dsEndereco = dsEndereco;
    }

    public String getNoEmail() {
        return noEmail;
    }

    public void setNoEmail(String noEmail) {
        this.noEmail = noEmail;
    }

    public String getNoEmailPessoal() {
        return noEmailPessoal;
    }

    public void setNoEmailPessoal(String noEmailPessoal) {
        this.noEmailPessoal = noEmailPessoal;
    }

    public String getNuTelefone() {
        return nuTelefone;
    }

    public void setNuTelefone(String nuTelefone) {
        this.nuTelefone = nuTelefone;
    }

    public Instant getDtAlteracao() {
        return dtAlteracao;
    }

    public void setDtAlteracao(Instant dtAlteracao) {
        this.dtAlteracao = dtAlteracao;
    }

    public String getUrlFoto() {
        return urlFoto;
    }

    public void setUrlFoto(String urlFoto) {
        this.urlFoto = urlFoto;
    }

    public String getInstantMessenger() {
        return instantMessenger;
    }

    public void setInstantMessenger(String instantMessenger) {
        this.instantMessenger = instantMessenger;
    }

    public Long getIcq() {
        return icq;
    }

    public void setIcq(Long icq) {
        this.icq = icq;
    }

    public String getMsn() {
        return msn;
    }

    public void setMsn(String msn) {
        this.msn = msn;
    }

    public String getYms() {
        return yms;
    }

    public void setYms(String yms) {
        this.yms = yms;
    }

    public String getDsCompEnd() {
        return dsCompEnd;
    }

    public void setDsCompEnd(String dsCompEnd) {
        this.dsCompEnd = dsCompEnd;
    }

    public String getDsBairro() {
        return dsBairro;
    }

    public void setDsBairro(String dsBairro) {
        this.dsBairro = dsBairro;
    }

    public String getNuCep() {
        return nuCep;
    }

    public void setNuCep(String nuCep) {
        this.nuCep = nuCep;
    }

    public String getNoCidade() {
        return noCidade;
    }

    public void setNoCidade(String noCidade) {
        this.noCidade = noCidade;
    }

    public String getUfCidade() {
        return ufCidade;
    }

    public void setUfCidade(String ufCidade) {
        this.ufCidade = ufCidade;
    }

    public LocalDate getDtExpedicao() {
        return dtExpedicao;
    }

    public void setDtExpedicao(LocalDate dtExpedicao) {
        this.dtExpedicao = dtExpedicao;
    }

}